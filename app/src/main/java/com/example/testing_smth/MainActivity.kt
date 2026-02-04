package com.example.testing_smth

import android.util.Log
import android.content.Intent
import android.os.Bundle
import android.util.TypedValue
//import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.jvm.java

import android.view.ViewGroup
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    private fun dpToPx(dp: Int): Int {
        val density = resources.displayMetrics.density
        return (dp * density + 0.5f).toInt()
    }
    lateinit var dateTV: TextView
    lateinit var calendarView: CalendarView
    lateinit var eventView: TextView

    lateinit var eventButton: Button
    val listOfNames1 = listOf(
        listOf("","January"
            ,"","","","","","","","","",""
            ,"","","","","","","","","Ace",""
            ,"","","","","","","","","",""),   //January
        listOf("","February"
            ,"","","","","","","","","",""
            ,"","","","","Henry","","","","",""
            ,"","","","","","","","Jimmy"),  //February
        listOf("","March"
            ,"","","","","","","","","",""
            ,"","","","","","","Max","","",""
            ,"","","","","","","","","",""),     //March
        listOf("","April"
            ,"","","","","","Loki","","","",""
            ,"","","","","","","","","",""
            ,"","","","","","","","",""),     //April
        listOf("","May"
            ,"","","","","","","","","",""
            ,"","","","","","","","","",""
            ,"","Luna","","","","","","","",""),       //May
        listOf("","June"
            ,"","","","","","","","","",""
            ,"","","","","","","","","",""
            ,"","","","Zeus","","","","",""),      //June
        listOf("","July"
            ,"","","","","","","","","",""
            ,"","","","","","","","","",""
            ,"","","","","Hachiko","","","","",""),      //July
        listOf("","August"
            ,"Atlas","","","","","","","","",""
            ,"","","","","","","","","",""
            ,"","","","","","","","","",""),    //August
        listOf("","September"
            ,"","","","","","","","","",""
            ,"","","","","Rex","","","","",""
            ,"","","","","","","","",""), //September
        listOf("","October"
            ,"","","","","","","","Sam","",""
            ,"","","","","","","","","",""
            ,"","","","","","","","","",""),   //October
        listOf("","Snow","Merlin"
            ,"","","","","","","","","",""
            ,"","","","Oscar","","","Bella","","",""
            ,"","","","","","","","",""),   //November
        listOf("","December"
            ,"","","","","","","","","",""
            ,"","","","","Daisy","","","","",""
            ,"","","","","","","","","","")   //December
    )
    //val listOfNames ={{"Snow";"Merlin"};{"Linda";"Lucas"}}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initializing variables of
        // list view with their ids.
        dateTV = findViewById(R.id.textView)
        calendarView = findViewById(R.id.calendarView)
        eventView = findViewById(R.id.eventView)
        eventButton=findViewById(R.id.button)



        calendarView.setOnDateChangeListener { _, year, month, dayOfWeek ->
           // val date = (dayOfWeek.toString() + "-" + (month + 1) + "-" + year)
           // dateTV.text = date
           // val i=month
            //   eventView.text = listOfNames1[i][j]

            eventButton.text = listOfNames1[month][dayOfWeek]
            eventButton.setOnClickListener{
                    val intent = Intent(this, SecondPageActivity::class.java)
                    intent.putExtra("day", dayOfWeek)
                    intent.putExtra("month", month)
                    startActivity(intent)
            }
            /*
            if ((month+1)==11) {
                if (dayOfWeek==10) {
                    eventView.text = listOfNames1[1][1]
                }
                else if (dayOfWeek==12) {
                    eventView.text = listOfNames1[1][2]
                }
                else{
                    maxView.text = "No Events Today"
                }
            }else{
                maxView.text = "No Events Today"
            }
            */
        }

    }
}


