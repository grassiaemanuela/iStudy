package com.example.istudy


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.fragment_start.*


class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var theAuth= FirebaseAuth.getInstance()



    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      textTitle.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_startFragment_to_edificioFragment)
        }

    }
}

