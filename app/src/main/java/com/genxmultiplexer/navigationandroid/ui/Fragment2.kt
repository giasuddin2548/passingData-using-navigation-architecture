package com.genxmultiplexer.navigationandroid.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.genxmultiplexer.navigationandroid.R
import kotlinx.android.synthetic.main.fragment1_layout.*
import kotlinx.android.synthetic.main.fragment1_layout.textViewAction1Id
import kotlinx.android.synthetic.main.fragment2_layout.*

class Fragment2 : Fragment(){

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment2_layout,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        arguments.let {
            if (it != null) {
               val a= Fragment2Args.fromBundle(it).argName
                textViewAction2Id.text=a
            }
        }

        textViewAction2Id.setOnClickListener {
            val action=Fragment2Directions.actionFragment2ToFragment1()
            Navigation.findNavController(it).navigate(action)
        }

    }
}