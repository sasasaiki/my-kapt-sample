package app.saiki.mykaptsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import app.saiki.generator.MyAnnotation

@MyAnnotation
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
