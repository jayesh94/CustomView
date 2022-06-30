package com.example.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var customView: CustomView? = null
    private var cvBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customView = findViewById(R.id.custom_view)
        cvBtn = findViewById(R.id.btn)

        cvBtn?.let {
            it.setOnClickListener{
                customView?.let {
                    it.text = it.getLabelText()
                }
            }
        }
    }
}