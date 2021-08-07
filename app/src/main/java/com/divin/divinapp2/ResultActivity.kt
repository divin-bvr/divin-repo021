package com.divin.divinapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        val username = intent.getStringExtra(constants.USER_NAME)
        tv_name.text = username

        val totalquestion = intent.getIntExtra(constants.TOTAL_QUESTIONS, 0)
        val correctanswers = intent.getIntExtra(constants.CORRECT_ANSWERS,0)
        tv_score.text = "The correct is $correctanswers out of $totalquestion"

        btn3.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}