package com.example.customview

import android.content.Context
import android.graphics.Paint
import android.util.AttributeSet


class CustomView : androidx.appcompat.widget.AppCompatButton{
    //circle and text colors
    private var circleCol = 0  //circle and text colors
    private var labelCol = 0

    //label text
    private var circleText: String? = null

    //paint for drawing custom view
    private var circlePaint: Paint? = null

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs){
        //paint object for drawing in onDraw
        //paint object for drawing in onDraw
        circlePaint = Paint()

        //get the attributes specified in attrs.xml using the name we included
        //get the attributes specified in attrs.xml using the name we included
        val a = context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.CustomView , 0, 0
        )

        try {
            //get the text and colors specified using the names in attrs.xml
            circleText = a.getString(R.styleable.CustomView_circleLabel);
            circleCol = a.getInteger(R.styleable.CustomView_circleColor, 0);//0 is default
            labelCol = a.getInteger(R.styleable.CustomView_labelColor, 0);
        } finally {
            a.recycle();
        }
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs,
        defStyleAttr)


    fun getCircleColor(): Int {
        return circleCol
    }

    fun getLabelColor(): Int {
        return labelCol
    }

    fun getLabelText(): String? {
        return circleText
    }

    fun setCircleColor(newColor: Int) {
        //update the instance variable
        circleCol = newColor
        //redraw the view
        invalidate()
        requestLayout()
    }

    fun setLabelColor(newColor: Int) {
        //update the instance variable
        labelCol = newColor
        //redraw the view
        invalidate()
        requestLayout()
    }

    fun setLabelText(newLabel: String) {
        //update the instance variable
        circleText = newLabel
        //redraw the view
        invalidate()
        requestLayout()
    }

}