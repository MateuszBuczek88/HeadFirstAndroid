package com.hfad.stopwatchj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {
    lateinit var stopwatch: Chronometer
    var isRunning: Boolean = false
    var offset: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stopwatch = findViewById<Chronometer>(R.id.stopwatch)
        val startButton = findViewById<Button>(R.id.start_button)
        startButton.setOnClickListener {
            if (!isRunning) {
                setBaseTime()
                stopwatch.start()
                isRunning = true
            }
        }
        val pauseButton = findViewById<Button>(R.id.pause_button)
        pauseButton.setOnClickListener {
            if (isRunning){
                saveOffset()
                stopwatch.stop()
                isRunning = false
            }
        }
        val resetButoon = findViewById<Button>(R.id.reset_button)
        resetButoon.setOnClickListener {
            offset =0
            setBaseTime()
        }


    }

    fun setBaseTime(){
        stopwatch.base = SystemClock.elapsedRealtime()
    }
    fun saveOffset(){
        offset = SystemClock.elapsedRealtime() - stopwatch.base
    }
}