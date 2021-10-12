package br.com.multitrek.contatos.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.multitrek.contatos.databinding.MainActivityBinding
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding
    private val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.mainViewModel = mainViewModel
    }

}