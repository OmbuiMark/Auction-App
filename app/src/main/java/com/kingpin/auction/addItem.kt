package com.kingpin.auction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kingpin.auction.databinding.ActivityAddItemBinding

class addItem : AppCompatActivity() {
    private lateinit var binding: ActivityAddItemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddItemBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAddFood.setOnClickListener {
            Toast.makeText(applicationContext,"GOTCHA bid authenticated", Toast.LENGTH_LONG).show()
            Thread.sleep(1000)
            finish()
        }
    }
}