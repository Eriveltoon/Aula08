package com.example.aula08

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aula08.databinding.FragmentTeste02Binding


class Teste02Fragment : Fragment() {

    lateinit var binding: FragmentTeste02Binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTeste02Binding.inflate(inflater)
        return binding.root
    }
}