package com.peculiaruc.alc_mmsystem_admin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateNewCertificateBtn = findViewById<Button>(R.id.buttonGenerateNewCertificate)
        generateNewCertificateBtn.setOnClickListener {
            val Intent = Intent(this, AdminCertificates16::class.java)
            startActivity(Intent)

        }
    }
}