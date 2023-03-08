package com.kingpin.auction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.kingpin.auction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3500)
        val splashscreen =installSplashScreen()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.admin.setOnClickListener {
            val intent = Intent(this,Admin::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"Welcome System Admin", Toast.LENGTH_LONG).show()
        }

        binding.user.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"Welcome", Toast.LENGTH_LONG).show()
        }

        binding.textSignup.setOnClickListener {
            val intent = Intent(this,Signup::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"Hello new user", Toast.LENGTH_LONG).show()
        }
    }
}