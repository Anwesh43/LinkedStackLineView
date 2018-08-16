package com.anwesh.uiprojects.linkedstacklineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.stacklineview.StackLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StackLineView.create(this)
    }
}
