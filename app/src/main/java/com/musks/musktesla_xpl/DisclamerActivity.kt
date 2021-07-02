package com.musks.musktesla_xpl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.musks.musktesla_xpl.databinding.ActivityDisclamerBinding

class DisclamerActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDisclamerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisclamerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.nextButton.setOnClickListener{
            val i = Intent(this@DisclamerActivity,RegistrationActivity::class.java)
            startActivity(i)
        }
    }
}