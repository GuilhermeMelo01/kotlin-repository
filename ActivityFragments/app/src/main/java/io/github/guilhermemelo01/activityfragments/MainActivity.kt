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

            // posso passar parametros com a intent para a nova tela
            val intent = Intent(
                this,
                DetalhesActivity::class.java
            )

//            intent.putExtra("filme", "The Witcher")
//            intent.putExtra("classificacao", 5)
//            intent.putExtra("avaliacoes", 9.2)

            val filme = Filme(
                "Sem limites",
                "teste",
                3.8,
                "Jamilton",
                "Netflix"
            )

            intent.putExtra("filme" ,filme)

            startActivity(intent)
        }
    }
}