package com.anwesh.uiprojects.stacklineview

/**
 * Created by anweshmishra on 17/08/18.
 */

import android.view.View
import android.view.MotionEvent
import android.content.Context
import android.graphics.Paint
import android.graphics.Canvas

val nodes : Int= 5

class StackLineView(ctx : Context) : View(ctx) {

    private val paint : Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas : Canvas) {

    }

    override fun onTouchEvent(event : MotionEvent) : Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
        }
        return true
    }

    data class State(var scale : Float = 0f, var prevScale : Float = 0f, var dir : Float = 0f) {

        fun update(cb : (Float) -> Unit) {
            this.scale += 0.1f * this.scale
            if (Math.abs(this.scale - this.prevScale) > 1) {
                this.scale = this.prevScale + this.dir
                this.dir = 0f
                this.prevScale = this.scale
                cb(this.prevScale)
            }
        }

        fun startUpdating(cb : () -> Unit) {
            if (this.dir == 0f) {
                this.dir = 1 - 2 * prevScale
                cb()
            }
        }
    }
}