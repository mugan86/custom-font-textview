package mugan86.custom.fonts.example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import mugan86.custom.font.textview.addHtml
import mugan86.custom.font.textview.concat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        customWithFontBold.addHtml("<u>Hola</u> Anartz!!")
        custom.concat(" Test")
    }
}