package com.venkat.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            //code

            Log.i("Main Activity", "Button was clicked !")

            Toast.makeText(this,"Button was clicked,showing through Toast",Toast.LENGTH_SHORT).show()

        }

    }
}
