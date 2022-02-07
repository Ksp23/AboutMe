package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDone: Button = findViewById(R.id.btnDone)
        val tfNickname: TextView = findViewById(R.id.tfNickname)
        val tvNickname: TextView = findViewById(R.id.tvNickname)

        btnDone.setOnClickListener(){
            val nickname = tfNickname.text.toString()
            tvNickname.text = nickname

            tvNickname.visibility = View.VISIBLE
            btnDone.visibility = View.GONE
            tfNickname.visibility = View.GONE
        }

        tvNickname.setOnClickListener{
            btnDone.visibility = View.VISIBLE
            tfNickname.visibility = View.VISIBLE
            tvNickname.visibility = View.GONE

            tfNickname.requestFocus()

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(tfNickname, 0)
        }
    }
}