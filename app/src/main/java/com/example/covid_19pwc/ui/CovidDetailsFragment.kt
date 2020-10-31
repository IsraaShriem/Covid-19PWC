package com.example.covid_19pwc.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covid_19pwc.R
import com.example.covid_19pwc.data.model.NewsApiResponse
import com.example.covid_19pwc.databinding.FragmentCovidDetailsBinding
import com.example.covid_19pwc.ui.adapters.CovidDetailsAdapter

class CovidDetailsFragment : Fragment() {
    private var newsResponse: NewsApiResponse? = null
    private lateinit var binding: FragmentCovidDetailsBinding
    private var adapter: CovidDetailsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            newsResponse = it.getParcelable(NEWS_RESPONSE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_covid_details, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.setTitle(R.string.covid_19_details)
        initAdapter()

    }

    private fun initAdapter() {
        if (newsResponse?.articles.isNullOrEmpty()) {
            binding.emptyList.visibility = View.VISIBLE
        } else {
            binding.emptyList.visibility = View.GONE
            binding.recyclerView.layoutManager =
                LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
            adapter = newsResponse?.articles?.let { CovidDetailsAdapter(it, activity) }
            binding.recyclerView.adapter = adapter
        }
    }

    companion object {
        const val TAG = "CovidDetailsFragment"
        private const val NEWS_RESPONSE = "newsResponse"

        fun newInstance(newsResponse: NewsApiResponse) =
            CovidDetailsFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(NEWS_RESPONSE, newsResponse)
                }
            }
    }
}