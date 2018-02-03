package mugan86.custom.font.textview

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.util.Log
import android.widget.TextView

/********************************************************************************
 * Created by Anartz Mugika (mugan86@gmail.com) on 3/2/18.
 */

class CustomFontTextView : TextView {

    var customFont: String? = null

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        style(context, attrs, -1)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        style(context, attrs, defStyle)

    }

    fun style(context: Context, attrs: AttributeSet, defStyle: Int) {
        val a = context.theme.obtainStyledAttributes(attrs, R.styleable.CustomFontTextView, defStyle, 0)

        try {
            customFont = a.getString(R.styleable.CustomFontTextView_fontName)
            loadCustomFont(context)

        } catch (e: Exception) {
            Log.i("Exception", "take_font_default")
            customFont = context.resources.getString(R.string.default_the_light_font)
            loadCustomFont(context)
        } finally {
            a.recycle()
        }
    }

    private fun loadCustomFont(context: Context) {
        val tf = Typeface.createFromAsset(context.assets,
                "font/$customFont.ttf")
        typeface = tf
    }

}