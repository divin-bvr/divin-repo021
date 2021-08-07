package com.divin.divinapp2

import android.content.Intent
import android.graphics.Color
import android.graphics.Color.parseColor
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_divinactivity.*

class divinactivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Whoiam>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrect: Int = 0
    private var mUserName: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_divinactivity)

        mUserName = intent.getStringExtra(constants.USER_NAME)

        mQuestionList = constants.getquestion()

        SetQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn2.setOnClickListener(this)




    }
    private fun answerView(answer:Int,drawableView:Int){
        when(answer){
            1->{
                tv_option_one.background = ContextCompat.getDrawable(this,drawableView)
            }

            2->{
                tv_option_two.background = ContextCompat.getDrawable(this,drawableView)
            }

            3->{
                tv_option_three.background = ContextCompat.getDrawable(this,drawableView)
            }

            4->{
                tv_option_four.background = ContextCompat.getDrawable(this,drawableView)
            }
        }

    }

    private fun SetQuestion(){


        val question = mQuestionList!![mCurrentPosition-1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionList!!.size) {
            btn2.text = "finish"
        }
        else {
            btn2.text = "COMFIRM"
        }

        progressbar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition"+"/"+ progressbar.max

        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.option1
        tv_option_two.text = question.option2
        tv_option_three.text = question.option3
        tv_option_four.text = question.option4
    }

    private fun defaultOptionsView(){

        val options = ArrayList<TextView>()
        options.add(0,tv_option_one)
        options.add(1,tv_option_two)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)

        for (option in options){
            option.setTextColor(Color.parseColor("#FF000000"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,
                R.drawable.default_option_border_bg)
        }

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one ->{
                selectedOptionView(tv_option_one,selectedOptionNum = 1)
            }

            R.id.tv_option_two ->{
                selectedOptionView(tv_option_two,selectedOptionNum = 2)
            }

            R.id.tv_option_three ->{
                selectedOptionView(tv_option_three,selectedOptionNum = 3)
            }

            R.id.tv_option_four ->{
                selectedOptionView(tv_option_four,selectedOptionNum = 4)
            }

            R.id.btn2 ->
            {
                if (mSelectedOptionPosition == 0)
                {
                    mCurrentPosition++
                    when{mCurrentPosition <= mQuestionList!!.size ->
                    {
                        SetQuestion()
                    }
                        else->
                        { val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(constants.USER_NAME,mUserName)
                            intent.putExtra(constants.CORRECT_ANSWERS,mCorrect)
                            intent.putExtra(constants.TOTAL_QUESTIONS,mQuestionList!!.size)
                            startActivity(intent)

                        }
                    }
                }

                else
                {
                    val question = mQuestionList?.get(mCurrentPosition -1)
                    if (question!!.correct != mSelectedOptionPosition)
                     {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                     }
                    else
                     {
                         mCorrect++
                     }
                    answerView(question.correct,R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionList!!.size)
                     {
                       btn2.text = "finish"
                     }
                    else
                     {
                       btn2.text = "next"
                     }
                    mSelectedOptionPosition = 0

                }
            }
        }

    }

    private fun selectedOptionView(tv:TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#FF000000"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg)
    }

}