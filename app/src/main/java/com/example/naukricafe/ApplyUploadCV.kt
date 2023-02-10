package com.example.naukricafe

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class ApplyUploadCV : AppCompatActivity() {

    lateinit var iv_backApplyUpload: ImageView
    lateinit var btn_applyJob: Button
    lateinit var btn_discoverMoreJobs: Button
    lateinit var btn_backToHome: Button
    lateinit var fab_addCV: FloatingActionButton
    lateinit var ll_beforeUploadCV: LinearLayout
    lateinit var ll_afterUploadCV: LinearLayout
    lateinit var tv_undoCVUpload: TextView
    var enabled: Boolean = false

    lateinit var ll_profilePhotoTitle: LinearLayout
    lateinit var ll_cvUploadApplication: LinearLayout

    lateinit var ll_profileUploadedCV: LinearLayout
    lateinit var ll_cvUploadDone: LinearLayout

    lateinit var ll_discoverMoreJobs: LinearLayout
    lateinit var ll_backToHome: LinearLayout
    lateinit var ll_applyButton: LinearLayout



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apply_upload_cv)

        btn_applyJob = findViewById(R.id.btn_applyJob)
        btn_discoverMoreJobs = findViewById(R.id.btn_discoverMoreJobs)
        btn_backToHome = findViewById(R.id.btn_backToHome)

        iv_backApplyUpload = findViewById(R.id.iv_backApplyUpload)
        iv_backApplyUpload.setOnClickListener(View.OnClickListener {
            finish()
        })
        btn_backToHome.setOnClickListener(View.OnClickListener {
            finish()
        })


        fab_addCV = findViewById(R.id.fab_addCV)

        ll_beforeUploadCV = findViewById(R.id.ll_beforeUploadCV)
        ll_afterUploadCV = findViewById(R.id.ll_afterUploadCV)
        tv_undoCVUpload = findViewById(R.id.tv_undoCVUpload)

        ll_cvUploadApplication  =findViewById(R.id.ll_cvUploadApplication)
        ll_cvUploadDone  =findViewById(R.id.ll_cvUploadDone)

        ll_applyButton  =findViewById(R.id.ll_applyButton)
        ll_discoverMoreJobs  =findViewById(R.id.ll_discoverMoreJobs)
        ll_backToHome  =findViewById(R.id.ll_backToHome)

        ll_profilePhotoTitle  =findViewById(R.id.ll_profilePhotoTitle)
        ll_profileUploadedCV  =findViewById(R.id.ll_profileUploadedCV)


        // Disabled button
        // Apply btn_applyJob: Button disabled -> ll_beforeUploadCV be visible and ll_afterUploadCV be gone
        // Change the gray color to white on CV upload
        //btn_applyJob.setTextColor(Color.GRAY)
        //btn_applyJob.setBackgroundResource(R.drawable.rectangular_rounded_button_disabled)

        // Enabled button
        // Apply btn_applyJob: Button enabled -> ll_beforeUploadCV be gone and ll_afterUploadCV be visible
        //btn_applyJob.setTextColor(Color.WHITE)
        //btn_applyJob.setBackgroundResource(R.drawable.rectangular_rounded_button)

        fab_addCV.setOnClickListener(View.OnClickListener {

            enabled = true

            // Enabled button
            // Apply btn_applyJob: Button enabled -> ll_beforeUploadCV be gone and ll_afterUploadCV be visible
            //btn_applyJob.setTextColor(Color.WHITE)
            //btn_applyJob.setBackgroundResource(R.drawable.rectangular_rounded_button)
            btn_applyJob.setTextColor(Color.WHITE)
            btn_applyJob.setBackgroundResource(R.drawable.rounded_button)
            ll_beforeUploadCV.visibility = View.GONE
            ll_afterUploadCV.visibility = View.VISIBLE
            tv_undoCVUpload.visibility = View.VISIBLE
        })

        btn_applyJob.setOnClickListener(View.OnClickListener {
            if (enabled){
                ll_cvUploadApplication.visibility = View.GONE
                ll_applyButton.visibility = View.GONE
                ll_cvUploadDone.visibility = View.VISIBLE
                ll_discoverMoreJobs.visibility = View.VISIBLE
                ll_backToHome.visibility = View.VISIBLE

                ll_profilePhotoTitle.visibility = View.GONE
                ll_profileUploadedCV.visibility = View.VISIBLE

                //Toast.makeText(this, "Job applied!!", Toast.LENGTH_SHORT).show()
                /*val snackBar = Snackbar.make(it, "Job applied!!", Snackbar.LENGTH_LONG).setAction("Ok", null)
                snackBar.setActionTextColor(Color.WHITE)
                val snackBarView = snackBar.view
                snackBarView.setBackgroundColor(resources.getColor(R.color.colorOrange))
                val textView = snackBarView.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
                textView.setTextColor(Color.WHITE)
                snackBar.show()*/


                ll_applyButton.visibility = View.GONE
                btn_applyJob.setTextColor(Color.GRAY)
                btn_applyJob.setBackgroundResource(R.drawable.rounded_button_disabled)
                ll_beforeUploadCV.visibility = View.VISIBLE
                ll_afterUploadCV.visibility = View.GONE
                tv_undoCVUpload.visibility = View.GONE
                enabled = false
            } else {
                //Toast.makeText(this, "Please upload CV to apply", Toast.LENGTH_SHORT).show()
                ll_cvUploadApplication.visibility = View.VISIBLE
                ll_applyButton.visibility = View.VISIBLE
                ll_cvUploadDone.visibility = View.GONE
                ll_discoverMoreJobs.visibility = View.GONE
                ll_backToHome.visibility = View.GONE

                val snackBar = Snackbar.make(it, "Please upload CV to apply", Snackbar.LENGTH_LONG).setAction("Ok", null)
                snackBar.setActionTextColor(Color.WHITE)
                val snackBarView = snackBar.view
                snackBarView.setBackgroundColor(resources.getColor(R.color.colorOrange))
                val textView = snackBarView.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
                textView.setTextColor(Color.WHITE)
                snackBar.show()
            }

        })

        tv_undoCVUpload.setOnClickListener (View.OnClickListener {
            enabled = false

            // Disabled button
            // Apply btn_applyJob: Button enabled -> ll_beforeUploadCV be visible and ll_afterUploadCV be gone
            //btn_applyJob.setTextColor(Color.GRAY)
            //btn_applyJob.setBackgroundResource(R.drawable.rectangular_rounded_button_disabled)
            btn_applyJob.setTextColor(Color.GRAY)
            btn_applyJob.setBackgroundResource(R.drawable.rounded_button_disabled)
            ll_beforeUploadCV.visibility = View.VISIBLE
            ll_afterUploadCV.visibility = View.GONE
            tv_undoCVUpload.visibility = View.GONE
        })

    }
}