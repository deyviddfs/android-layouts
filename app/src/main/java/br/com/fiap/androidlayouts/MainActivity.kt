package br.com.fiap.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openConstraint(view: View) {
        val intent = Intent(this, ConstraintActivity::class.java).apply {}
        startActivity(intent)
    }

    fun openFrame(view: View) {
        val intent = Intent(this, FrameActivity::class.java).apply {}
        startActivity(intent)
    }

    fun openLinearHorizontal(view: View) {
        val intent = Intent(this, LinearHorizontalActivity::class.java).apply {}
        startActivity(intent)
    }

    fun openLinearVertical(view: View) {
        val intent = Intent(this, LinearVerticalActivity::class.java).apply {}
        startActivity(intent)
    }
}