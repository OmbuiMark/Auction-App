package com.kingpin.auction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kingpin.auction.databinding.ActivityDashboardBinding
import kotlin.system.exitProcess

class Dashboard : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.addBid.setOnClickListener{
            val intent = Intent(this,addItem::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"Spooky says its Your time to sell an item", Toast.LENGTH_LONG).show()
        }

        binding.incomingItems.setOnClickListener{
            val intent = Intent(this,addBid::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"Hello there make your bid", Toast.LENGTH_LONG).show()
        }
        binding.userDetails.setOnClickListener{
            val intent = Intent(this,UserDetails::class.java)
            startActivity(intent)
        }

        binding.visitMarket.setOnClickListener{
            val intent = Intent(this,bids::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"Hello there make your bid", Toast.LENGTH_LONG).show()
        }

        binding.help.setOnClickListener{
            Toast.makeText(applicationContext,"Contact +2547123456789 for assistance", Toast.LENGTH_LONG).show()
        }

        binding.exitapp.setOnClickListener{
            Toast.makeText(applicationContext,"Exiting application...", Toast.LENGTH_LONG).show()
            finishAffinity()
            exitProcess(0)
        }
    }
}