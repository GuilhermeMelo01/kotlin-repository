package io.github.guilhermemelo01.activityfragments

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var buttonAbrir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAbrir = findViewById(R.id.btn_abrir)

        buttonAbrir.setOnClickListener {

            val intent = Intent(this, DetalhesActivity::class.java)

            startActivity(intent)
        }
    }
}