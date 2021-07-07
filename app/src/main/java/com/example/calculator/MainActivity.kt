package com.example.calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalculate = button_calc
        val resul = textResul

        btCalculate.setOnClickListener {
            val grade1 = Integer.parseInt(textGrade1.text.toString())
            val grade2 = Integer.parseInt(textGrade2.text.toString())
            val average = (grade1 + grade2)/2
            val absences = Integer.parseInt(textAbsences.text.toString())
            if(average >= 6 && absences <= 10){
                resul.setTextColor(Color.GREEN)
                resul.setText("Student was approved \n Average: $average \n Absences: $absences")
            }else if(average < 6 && absences <=10){
                resul.setTextColor(Color.RED)
                resul.setText("Student was not approved \n *Average: $average \n Absences: $absences")
            }else if(average >= 6 && absences < 10){
                resul.setTextColor(Color.RED)
                resul.setText("Student was not approved \n Average: $average \n *Absences: $absences")
            }else{
                resul.setTextColor(Color.RED)
                resul.setText("Student was not approved \n *Average: $average \n *Absences: $absences")
            }

         }
    }
}