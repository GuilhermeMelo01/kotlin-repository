package io.github.guilhermemelo01.fragments

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import io.github.guilhermemelo01.fragments.fragments.ChamadasFragment
import io.github.guilhermemelo01.fragments.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnMercado: Button
    private lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnMercado = findViewById(R.id.btn_mercado)
        btnChamadas = findViewById(R.id.btn_chamadas)


        btnMercado.setOnClickListener {
//            val conversasFragment = ConversasFragment()

            val bundle = bundleOf(
                "categoria" to "mercado",
                "usuario" to "Guilherme"
            )
//            conversasFragment.arguments = bundle


//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.fragment_conteudo, conversasFragment)
//                .commit()

            supportFragmentManager.commit {
                replace<ConversasFragment>(
                    R.id.fragment_conteudo,
                    args = bundle
                )
            }

        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, ChamadasFragment())
//                .remove(conversasFragment)
                .commit()
        }
    }
}