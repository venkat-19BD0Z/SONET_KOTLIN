package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var button=findViewById<Button>(R.id.button)
        var text=findViewById<TextView>(R.id.text)
        var input_result=findViewById<EditText>(R.id.input_radius)
        var flag=false
        button.setOnClickListener(View.OnClickListener {
            var radius:Double=input_result.text.toString().toDouble()
            val pi:Double=3.141
            var area = pi * radius * radius
            text.setText("Result = $area")
        }


        )

    }
}