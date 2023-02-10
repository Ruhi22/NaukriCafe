package com.example.naukricafe

import android.annotation.SuppressLint
import android.content.res.Resources
import android.graphics.Color
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class JobProfileActivity : AppCompatActivity() {

    lateinit var iv_back: ImageView
    lateinit var btn_jobDescription: Button
    lateinit var ll_description: LinearLayout
    lateinit var btn_jobSkills: Button
    lateinit var ll_skills: LinearLayout
    lateinit var btn_applyJob: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_profile)

        iv_back = findViewById(R.id.iv_back)

        btn_jobDescription = findViewById(R.id.btn_jobDescription)
        ll_description = findViewById(R.id.ll_description)

        btn_jobSkills = findViewById(R.id.btn_jobSkills)
        ll_skills = findViewById(R.id.ll_skills)

        btn_applyJob = findViewById(R.id.btn_applyJob)

        btn_jobDescription.setOnClickListener(View.OnClickListener {
            ll_description.visibility = View.VISIBLE
            ll_skills.visibility = View.GONE
            btn_jobDescription.setTextColor(Color.WHITE)
            btn_jobDescription.setBackgroundResource(R.drawable.rectangular_rounded_button)
            btn_jobSkills.setTextColor(Color.GRAY)
            btn_jobSkills.setBackgroundResource(R.drawable.rectangular_rounded_button_disabled)
        })

        btn_jobSkills.setOnClickListener(View.OnClickListener {
            ll_description.visibility = View.GONE
            ll_skills.visibility = View.VISIBLE
            btn_jobSkills.setTextColor(Color.WHITE)
            btn_jobSkills.setBackgroundResource(R.drawable.rectangular_rounded_button)
            btn_jobDescription.setTextColor(Color.GRAY)
            btn_jobDescription.setBackgroundResource(R.drawable.rectangular_rounded_button_disabled)
        })

        iv_back.setOnClickListener(View.OnClickListener {
            finish()
        })

    }
}