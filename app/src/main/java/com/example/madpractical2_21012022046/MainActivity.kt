package com.example.madpractical2_21012022046

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private val TAG = "mainactivity"
    private lateinit var mycl: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl = findViewById(R.id.mycle)
        Log.i(TAG, "onCreate:function called")
        Toast.makeText(this, "onCreate:function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate:Function called", Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onstart:function called")
        Toast.makeText(this, "onstart:function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate:Function called", Snackbar.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume:Function Called ")
        Toast.makeText(this, "onResume:Function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onResume:Function Called", Snackbar.LENGTH_LONG).show()
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause:Function Called ")
        Toast.makeText(this, "onPause:Function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onPause:Function Called",Snackbar.LENGTH_LONG).show()
   }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop:Function Called ")
        Toast.makeText(this, "onStop:Function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStop:Function Called",Snackbar.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy:Function Called ")
        Toast.makeText(this, "onDestroy:Function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onDestroy:Function Called",Snackbar.LENGTH_LONG).show()
    }

}


