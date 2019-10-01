package com.example.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //syntetic call motion layout
        motion_layout.transitionToEnd()
        val intent = Intent(this,DetailActivity::class.java)
        Timer().schedule(2000){
            startActivity(intent)
            finish()
        }
    }
}
