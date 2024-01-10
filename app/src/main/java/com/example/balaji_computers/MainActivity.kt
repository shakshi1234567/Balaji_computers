package com.example.balaji_computers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var entname =findViewById<EditText>(R.id.ednam)
        var batan =findViewById<Button>(R.id.click)

        batan.setOnClickListener(){

            var catchtext=entname.text.toString()
            Toast.makeText(this,""+catchtext,Toast.LENGTH_SHORT).show()
        }
    }

}