package com.divin.divinapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener() {
            if (field1.text.toString().isEmpty()) {
                Toast.makeText(this, "please,insert your name first", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, divinactivity::class.java)
                intent.putExtra(constants.USER_NAME,field1.text.toString())
                startActivity(intent)
                finish()
            }

        }
    }
}
