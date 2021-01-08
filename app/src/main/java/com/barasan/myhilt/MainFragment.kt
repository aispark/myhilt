package com.barasan.myhilt

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.barasan.myhilt.module.qualifier.Hashcode
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {
    @Inject
    lateinit var singletonClass: SingletonClass

    @Hashcode
    @Inject
    lateinit var hashcode: String

    private val viewModel:MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            val intent = Intent(requireContext(), SecondActivity::class.java)
            startActivity(intent)
        }

        Log.d("singleton", singletonClass.hashCode().toString())
        Log.d("singleton", "hashcode: $hashcode")
        Log.d("singleton", "viewmodel: ${viewModel.getHashcode()}")
        button2.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }
    }
}

