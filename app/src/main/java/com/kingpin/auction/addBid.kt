package com.kingpin.auction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kingpin.auction.databinding.ActivityAddBidBinding

class addBid : AppCompatActivity() {
    private lateinit var binding: ActivityAddBidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBidBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnPlaceBid.setOnClickListener{
            Toast.makeText(applicationContext,"Bid succesfully placed you will be contacted", Toast.LENGTH_LONG).show()
        }
    }
}