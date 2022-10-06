package com.example.aula08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula08.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Binding Automatico
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Binding Automatico
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFrag01.setOnClickListener {
            //Chamando fragmento na atividade
            val fragment = Teste01Fragment()
            supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
        }

        binding.buttonFrag02.setOnClickListener {
            val fragment = Teste02Fragment()
            supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
        }
    }
}