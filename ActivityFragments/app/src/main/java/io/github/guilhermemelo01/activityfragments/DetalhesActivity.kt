package io.github.guilhermemelo01.activityfragments

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.logging.Logger

class DetalhesActivity : AppCompatActivity() {

    lateinit var buttonFechar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "onCreate")
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById(R.id.btn_fechar)

        buttonFechar.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ciclo_vida", "onRestart")
    }

    override fun onDestroy() {
        Log.i("ciclo_vida", "onDestroy")
        super.onDestroy()
    }
}