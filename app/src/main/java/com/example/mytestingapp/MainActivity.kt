package com.example.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnSetValue: Button
    private lateinit var tvText: TextView

    private var names = ArrayList<String>()
    private lateinit var imgPreview: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tv_text)
        btnSetValue.setOnClickListener(this)

        names.add("Aida Liana")
        names.add("Aida")
        names.add("Liana")
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_set_value) {
            Log.d("MainActivity", names.toString())
            val name = StringBuilder()
            for (i in 0..3) {
                name.append(names[i]).append("\n")
            }
            tvText.text = name.toString()
            imgPreview = findViewById(R.id.img_preview)
            imgPreview.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.fronalpstock_big))
        }
    }
}