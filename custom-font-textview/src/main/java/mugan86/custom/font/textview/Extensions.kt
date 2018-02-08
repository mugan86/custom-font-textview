package mugan86.custom.font.textview

import android.content.Context
import android.graphics.Typeface
import android.os.Build
import android.text.Html
import java.util.*

/********************************************************************************
 * Created by Anartz Mugika (mugan86@gmail.com) on 5/2/18.
 ********************************************************************************/
fun CustomFontTextView.addHtml(html: String) =
                    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) text = Html.fromHtml(html)
                    else text = Html.fromHtml(html, Html.FROM_HTML_MODE_COMPACT)

fun CustomFontTextView.concat(addText: String) {
    text = text.toString().plus(addText)
}

fun CustomFontTextView.loadCustomFont(customFont: String, context: Context) {
    typeface = Typeface.createFromAsset(
            context.assets,
            "font/$customFont"
    )
}

fun selectRandomFont(context: Context, arrayStringXMLReference: Int = R.array.defaults_fonts): String =
        context.resources.getStringArray(arrayStringXMLReference)
            .get(takeOneFontWithRandom(1, 0,
                    context.resources.getStringArray(arrayStringXMLReference).size - 1)[0])

// Random

private fun takeOneFontWithRandom(numbersTotal: Int = 1, min: Int, max: Int) : List<Int> {
    val list = List(numbersTotal) { randomNumber(min, max + 1) }.distinct()
    if (list.size == numbersTotal) return list
    return takeOneFontWithRandom(numbersTotal, min, max)
}

private fun randomNumber(min: Int, max: Int): Int = (min..max).random()

private fun ClosedRange<Int>.random() = Random().nextInt(endInclusive - start) +  start

