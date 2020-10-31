package com.example.covid_19pwc.ui

import android.annotation.SuppressLint
import android.content.Context
import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.covid_19pwc.R
import com.example.covid_19pwc.data.model.CountriesResponse
import com.example.covid_19pwc.data.model.NewsApiResponse
import com.example.covid_19pwc.data.model.TrackingApiResponse
import com.example.covid_19pwc.databinding.FragmentMapBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*


class MapFragment : Fragment(), OnMapReadyCallback {

    private var newsResponse: NewsApiResponse?=null
    private var latLong: LatLng? = null
    private lateinit var countryCode: String
    private var countries: ArrayList<CountriesResponse>? = null
    private var countryName: String? = null
    private val sdf = SimpleDateFormat("yyyy/M/dd")
    private lateinit var mMap: GoogleMap
    private val viewModel: TrackingViewModel by viewModel()
    private lateinit var binding: FragmentMapBinding
    private val bag = CompositeDisposable()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_map, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        return binding.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)


        viewModel.countriesResponse
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                countries = it
                for (i: Int in 0 until it.size) {
                    if (it[i].name.contains(countryName!!, true)) {
                        countryCode = it[i].alpha2Code
                        viewModel.getNews(countryCode, CATEGORY, API_KEY)
                    }
                }
            }, {
                it.printStackTrace()
            }).addTo(bag)


        viewModel.newsResponse
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                viewModel.getTrackingApi(sdf.format(Date()), sdf.format(Date()))
                newsResponse=it
            }, {
                it.printStackTrace()
            }).addTo(bag)


        viewModel.trackingApiResponse
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ trackingResponse ->
                mMap.clear()
                // Add a marker
                latLong?.let {
                    val city = LatLng(it.latitude, it.longitude)
                    mMap.addMarker(
                        MarkerOptions().position(city)
                            .title(countryName)
                    )
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(city))

                    mMap.setOnMarkerClickListener {
                        showAlertDialog(trackingResponse)
                        false
                    }
                }


            }, {
                it.printStackTrace()
            }).addTo(bag)


    }



    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        mMap.setOnMapClickListener {
            binding.progressLayout.visibility=View.VISIBLE
            countryName = getCountryName(requireContext(), it.latitude, it.longitude)

            if (!countryName.isNullOrEmpty()) {
                latLong = it
                countryName?.let {name ->
                    binding.progressLayout.visibility=View.GONE
                    viewModel.getCountries(name, true)
                }

            }else{
                binding.progressLayout.visibility=View.GONE

            }

        }

    }

    private fun getCountryName(context: Context, latitude: Double, longitude: Double): String? {
        val geoCoder = Geocoder(context, Locale.getDefault())
        val addresses: List<Address>
        try {
            addresses = geoCoder.getFromLocation(latitude, longitude, 1)
            return if (addresses != null && addresses.isNotEmpty()) {
                addresses[0].countryName
            } else {
                Toast.makeText(context,R.string.country_name_not_available,Toast.LENGTH_SHORT).show()
                binding.progressLayout.visibility=View.GONE
                null


            }
        } catch (ignored: IOException) {
            Toast.makeText(context,R.string.country_name_not_available,Toast.LENGTH_SHORT).show()
            binding.progressLayout.visibility=View.GONE
        }
        return null
    }

    private fun showAlertDialog(trackingResponse: TrackingApiResponse?) {
        val dialogView = layoutInflater.inflate(R.layout.custom_alert_dialog, null)
        val customDialog = AlertDialog.Builder(requireContext()).setView(dialogView)
            .show()
        val openCases = dialogView.findViewById<TextView>(R.id.open_cases)
        val confirmedCases = dialogView.findViewById<TextView>(R.id.confirmed_cases)
        val newRecovered = dialogView.findViewById<TextView>(R.id.new_recovered)
        val moreDetails = dialogView.findViewById<Button>(R.id.more_details)
        openCases.text = trackingResponse?.total?.todayOpenCases.toString()
        confirmedCases.text = trackingResponse?.total?.todayConfirmed.toString()
        newRecovered.text = trackingResponse?.total?.todayNewRecovered.toString()
        moreDetails.setOnClickListener {
            customDialog.dismiss()
            newsResponse?.let {
                navigateToFragment(CovidDetailsFragment.newInstance(it),CovidDetailsFragment.TAG)

            }

        }
    }
    private  fun navigateToFragment(fragment: Fragment, fragmentTag: String) {
        this
            .fragmentManager
            ?.beginTransaction()
            ?.add(
                R.id.parent,
                fragment,
                tag
            )
            ?.addToBackStack(fragmentTag)
            ?.commit()
    }

    companion object {
        const val TAG = "mapFragment"
        const val CATEGORY = "health"
        const val API_KEY = "5a6c9e111377406abaf3f445adaee541"

        fun newInstance() = MapFragment()

    }


}