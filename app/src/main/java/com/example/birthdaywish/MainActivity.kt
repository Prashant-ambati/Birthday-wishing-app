package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun Createbirthdaycard(view: View) {

        val name = userinput.editableText.toString()

        val intent = Intent(this, birthdaygreetingactivity::class.java)
        intent.putExtra(birthdaygreetingactivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}