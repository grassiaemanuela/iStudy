package com.example.istudy


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_edificio.*


class EdificioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edificio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        textEdificioVRM.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_edificioFragment_to_viaRomaFragment)
        }

        imageViewVRM.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_edificioFragment_to_viaRomaFragment)
        }
    }

}
