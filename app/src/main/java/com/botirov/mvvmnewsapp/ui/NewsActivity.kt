package com.botirov.mvvmnewsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.botirov.mvvmnewsapp.R
import com.botirov.mvvmnewsapp.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {


    private lateinit var binding: ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding= ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = supportFragmentManager.findFragmentById(R.id.newsNavHostFragment)?.findNavController()
        navController?.let { binding.bottomNavigationView.setupWithNavController(it) }
    }
}