package com.kingpin.auction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kingpin.auction.databinding.ActivityAdminBinding

class Admin : AppCompatActivity() {
    private lateinit var binding: ActivityAdminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAdminBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bidderList.setOnClickListener{
            val test = Intent(this,ShowAllBiidders::class.java)
            startActivity(test)
        }

        binding.AdminBid.setOnClickListener{
            val intent = Intent(this,addItem::class.java)
            startActivity(intent)
        }

    }
}