package com.example.customtoast

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toat.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShow.setOnClickListener {

            Toast(this).apply {

                duration = Toast.LENGTH_LONG

                view = layoutInflater.inflate(R.layout.custom_toat , customToast)
                show()

            }
        }
    }
}