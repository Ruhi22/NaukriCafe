package com.example.naukricafe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn_jobProfile: Button
    lateinit var btn_jobUploadCV: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_jobProfile = findViewById(R.id.btn_jobProfile)
        btn_jobProfile.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, JobProfileActivity::class.java)
            startActivity(intent)
        })

        btn_jobUploadCV = findViewById(R.id.btn_jobUploadCV)
        btn_jobUploadCV.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ApplyUploadCV::class.java)
            startActivity(intent)
        })


    }
}