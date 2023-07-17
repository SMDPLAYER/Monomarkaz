package uz.smd.monomarkaz

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val wb=  findViewById<WebView>(R.id.wbView)
        wb.settings.javaScriptEnabled=true
        wb.setBackgroundColor(Color.TRANSPARENT);
        wb.loadUrl("https://uitc.uz/")
    }
}