package com.example.task04a

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class ViewOne : View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        // this - reference to current class
        this.setBackgroundColor(Color.argb(128,32,64,255))
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {

        val DEBUG_TAG = "MyTask"

        val action: Int = event.actionMasked

        val eventSring = event.toString()
        Log.d(DEBUG_TAG, eventSring)

        when (action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d(DEBUG_TAG, "Action was DOWN")
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                Log.d(DEBUG_TAG, "Action was MOVE")
                return true
            }
            MotionEvent.ACTION_UP -> {
                Log.d(DEBUG_TAG, "Action was UP")
                return true
            }
            MotionEvent.ACTION_CANCEL -> {
                Log.d(DEBUG_TAG, "Action was CANCEL")
                return true
            }
            MotionEvent.ACTION_OUTSIDE -> {
                Log.d(DEBUG_TAG, "Outside bounds of current screen element.")
                return true
            }
            else -> return super.onTouchEvent(event)
        }
    }
}