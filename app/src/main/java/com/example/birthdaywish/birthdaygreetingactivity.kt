package com.example.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthdaygreetingactivity.*

class birthdaygreetingactivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreetingactivity)

        val name = intent.getStringExtra(NAME_EXTRA)

        maachuda.text = "Happy Birthday\n $name!"
    }
}