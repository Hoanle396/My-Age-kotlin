package com.example.myage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*;
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnage: Button = findViewById(R.id.button)
        btnage.setOnClickListener { age()
        }

    }
    fun age(){
        try {
            val birth: EditText = findViewById(R.id.editTextDate)
            val b = Integer.parseInt(birth.text.toString())
            val year = Integer.parseInt(Calendar.getInstance().get(Calendar.YEAR).toString())
            val result = year - b
            val hien: TextView = findViewById(R.id.textView)
            if(result>100||result<1){
                hien.setText("Nhập đúng năm sinh")
            }
            else{
                hien.setText("Tuổi Của Bạn Là ${result}")
            }
        }
        catch (e: Exception){
            val hien: TextView = findViewById(R.id.textView)
            hien.setText("Nhập đúng năm sinh")
        }
    }
}