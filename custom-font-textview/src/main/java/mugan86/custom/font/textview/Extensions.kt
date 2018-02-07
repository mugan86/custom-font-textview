package mugan86.custom.font.textview

import android.os.Build
import android.text.Html

/********************************************************************************
 * Created by Anartz Mugika (mugan86@gmail.com) on 5/2/18.
 ********************************************************************************/
fun CustomFontTextView.addHtml(html: String) =
                    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) text = Html.fromHtml(html)
                    else text = Html.fromHtml(html, Html.FROM_HTML_MODE_COMPACT)

fun CustomFontTextView.concat(addText: String){
    text = "${text.toString()} $addText"
}
