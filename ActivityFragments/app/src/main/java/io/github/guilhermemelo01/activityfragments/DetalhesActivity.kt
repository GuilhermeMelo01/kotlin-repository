package io.github.guilhermemelo01.activityfragments

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.logging.Logger

class DetalhesActivity : AppCompatActivity() {

    lateinit var buttonFechar: Button
    lateinit var textFilme: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "onCreate")
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById(R.id.btn_fechar)
        textFilme = findViewById(R.id.textFilme)

        val bundle = intent.extras
//        val filme = bundle?.getString("filme")
//        val classificacao = bundle?.getInt("classificacao")
//        val avaliacoes = bundle?.getDouble("avaliacoes")
//        val resultado = "filme $filme - class. $classificacao - aval. $avaliacoes"
//        textFilme.text = resultado


        val filme = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            bundle?.getParcelable("filme", Filme::class.java)
        } else {
            bundle?.getParcelable("filme")
        }


        textFilme.text = "${filme?.nome} - ${filme?.distribuidor}"

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