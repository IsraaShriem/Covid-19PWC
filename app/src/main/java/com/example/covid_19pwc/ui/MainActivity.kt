package com.example.covid_19pwc.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.covid_19pwc.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigateToFragment(MapFragment.newInstance(),MapFragment.TAG)

    }

    private fun navigateToFragment(fragment: Fragment, fragmentTag: String) {
        this
            .supportFragmentManager
            .beginTransaction()
            .add(
                R.id.parent,
                fragment,
                fragmentTag
            )
            .addToBackStack(fragmentTag)
            .commit()
    }
}
