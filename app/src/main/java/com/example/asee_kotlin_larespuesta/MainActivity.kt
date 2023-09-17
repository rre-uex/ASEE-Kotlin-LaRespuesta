package com.example.asee_kotlin_larespuesta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val answers = arrayOf(42, -10, 0, 100, 1000)
    private val answer  = 42

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val answerView = findViewById<View>(R.id.respuesta_view) as TextView

        val value : Int = findAnswer()
        val output = if (value == answer) "42" else "Puede que nunca la sepamos"
        answerView.text = "La respuesta a la vida, al universo a todo es: \n $output"

    }

    private fun findAnswer(): Int {
        for (i in answers.indices) {
            if (answers[i] != answer) {
                return answers[i]
            }
        }
        return -1
    }
}