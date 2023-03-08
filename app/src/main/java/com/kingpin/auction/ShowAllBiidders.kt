package com.kingpin.auction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kingpin.auction.databinding.ActivityShowAllBiiddersBinding

class ShowAllBiidders : AppCompatActivity() {

    private lateinit var binding: ActivityShowAllBiiddersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowAllBiiddersBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnMakeWinner.setOnClickListener{
            Toast.makeText(applicationContext,"Item succesfully sold To winner", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}