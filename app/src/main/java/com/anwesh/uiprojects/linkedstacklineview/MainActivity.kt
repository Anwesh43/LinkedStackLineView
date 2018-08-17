package com.anwesh.uiprojects.linkedstacklineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.anwesh.uiprojects.stacklineview.StackLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view : StackLineView = StackLineView.create(this)
        fullScreen()
        view.addOnAnimationComplete({createToast("${it + 1} animation completed")}, {createToast("${it + 1} animation is reset")})
    }

    fun createToast(msg : String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

fun MainActivity.fullScreen() {
    supportActionBar?.hide()
    window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
}