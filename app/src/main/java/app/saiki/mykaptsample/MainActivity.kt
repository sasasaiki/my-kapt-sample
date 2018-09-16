package app.saiki.mykaptsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import app.saiki.annotation.Greeting
import app.saiki.generated.MainActivity_Greeter

@Greeting
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kaptで",MainActivity_Greeter().greet())
    }
}

