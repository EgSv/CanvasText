package ru.startandroid.develop.canvastext

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(DrawView(this))
    }

    /*internal inner class DrawView(context: Context?) : View(context) {
        private var fontPaint: Paint
        private var redPaint: Paint = Paint()
        private var text = "Test width text"
        private var fontSize = 200
        private var widths: FloatArray
        private var width: Float

        init {
            redPaint.color = Color.RED
            fontPaint = Paint(Paint.ANTI_ALIAS_FLAG)
            fontPaint.textSize = fontSize.toFloat()
            fontPaint.style = Paint.Style.STROKE

            width = fontPaint.measureText(text)

            widths = FloatArray(text.length)
            fontPaint.getTextWidths(text, widths)
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)
            canvas.translate(50f, 250f)

            canvas.drawText(text, 0f, 0f, fontPaint)

            canvas.drawLine(0f, 0f, width, 0f, fontPaint)

            canvas.drawCircle(0f, 0f, 3f, redPaint)
            for (w in widths) {
                canvas.translate(w, 0f)
                canvas.drawCircle(0f, 0f, 3f, redPaint)
            }
        }
    }*/

    /*internal inner class DrawView(context: Context): View(context) {
        private var p: Paint = Paint()
        private var text = "Test width text"
        private var fontSize = 80
        private var maxWidth = 350
        private var realWidth = 0f
        private var cnt = 0
        private var info = ""

        init {
            p = Paint(Paint.ANTI_ALIAS_FLAG)
            p.textSize = fontSize.toFloat()

            val measuredWidth = FloatArray(1)
            cnt = p.breakText(text, true, maxWidth.toFloat(), measuredWidth)
            realWidth = measuredWidth[0]

            info = "cnt = $cnt, realWidth = $realWidth, maxWidth = $maxWidth"
        }

        override fun onDraw(canvas: Canvas?) {
            canvas!!.drawARGB(80, 102, 204, 255)

            p.textSize = 24f
            canvas.drawText(info, 50f, 50f, p)

            p.textSize = fontSize.toFloat()
            canvas.drawText(text, 50f, 250f, p)

            p.strokeWidth = 10f

            p.color = Color.BLUE
            canvas.drawLine(50f, 260f, 50f + realWidth, 250f, p)

            p.color = Color.GREEN
            canvas.drawLine(50f, 270f, 50f + maxWidth, 270f, p)
        }
    }*/

    /*internal inner class DrawView(context: Context): View(context) {
        private var p: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
        private var text = "Test width text"
        private var fontSize = 60
        private var yValue = 80f

        init {
            p.textSize = fontSize.toFloat()
            p.style = Paint.Style.STROKE
        }

        override fun onDraw(canvas: Canvas?) {
            canvas!!.drawARGB(80, 102, 204, 255)

            canvas.translate(50f, yValue)
            canvas.drawText(text, 0f, 0f, p)

            canvas.translate(0f, yValue)
            p.typeface = Typeface.create(Typeface.MONOSPACE, Typeface.NORMAL)
            canvas.drawText(text, 0f, 0f, p)

            canvas.translate(0f, yValue)
            p.typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            canvas.drawText(text, 0f, 0f, p)

            canvas.translate(0f, yValue)
            p.typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD_ITALIC)
            canvas.drawText(text, 0f,0f, p)

            canvas.translate(0f, yValue)
            p.typeface = Typeface.create(Typeface.DEFAULT, Typeface.ITALIC)
            canvas.drawText(text, 0f, 0f, p)
        }
    }*/

    /*internal class DrawView(context: Context?) : View(context) {
        private var p: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
        private var text = "Test width text"
        private var fontSize = 60
        private var yV = 80f

        init {
            p.textSize = fontSize.toFloat()
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            canvas.translate(50f, yV)
            canvas.drawText(text, 0f, 0f, p)

            canvas.translate(0f, yV)
            p.textScaleX = 1.5f
            canvas.drawText(text, 0f, 0f, p)
            p.textScaleX = 1f

            canvas.translate(0f, yV)
            p.textSkewX = 0.5f
            canvas.drawText(text, 0f, 0f, p)
            p.textSkewX = 0f

            canvas.translate(0f, yV)
            p.isUnderlineText = true
            canvas.drawText(text, 0f, 0f, p)
            p.isUnderlineText = false

            canvas.translate(0f, yV)
            p.isStrikeThruText = true
            canvas.drawText(text, 0f, 0f, p)
            p.isStrikeThruText = false
        }
    }*/

    internal inner class DrawView(context: Context): View(context) {
        private var p = Paint(Paint.ANTI_ALIAS_FLAG)
        private var text = "Test text"
        private var fontSize = 100
        private var pos = floatArrayOf()

        init {
            p.textSize = fontSize.toFloat()

            pos = floatArrayOf(100f, 300f, 200f, 150f, 300f, 500f, 400f, 300f, 500f,
                250f, 600f, 350f, 700f, 400f, 800f, 200f, 900f, 500f)
        }

        override fun onDraw(canvas: Canvas?) {
            canvas!!.drawARGB(80, 102, 204, 255)

            canvas.drawPosText(text, pos, p)
        }
    }
}