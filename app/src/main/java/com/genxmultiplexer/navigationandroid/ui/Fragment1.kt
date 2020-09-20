package com.genxmultiplexer.navigationandroid.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.genxmultiplexer.navigationandroid.R
import kotlinx.android.synthetic.main.fragment1_layout.*

class Fragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment1_layout,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)



        textViewAction1Id.setOnClickListener {
            val action=Fragment1Directions.actionFragment1ToFragment2("I'm From Main Fragment")
            Navigation.findNavController(it).navigate(action)
        }


    }
}