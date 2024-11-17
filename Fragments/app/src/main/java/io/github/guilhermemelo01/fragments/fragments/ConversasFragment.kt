package io.github.guilhermemelo01.fragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import io.github.guilhermemelo01.fragments.R

class ConversasFragment : Fragment() {

    private lateinit var editNome: EditText
    private lateinit var textNome: TextView
    private lateinit var textCategoria: TextView
    private lateinit var btnExecutar: Button

    private var categoria : String? = null
    private var usuario : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        categoria = arguments?.getString("categoria")
        usuario = arguments?.getString("usuario")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false
        )

        editNome = view.findViewById(R.id.edit_nome)
        textNome = view.findViewById(R.id.text_nome)
        btnExecutar = view.findViewById(R.id.btn_executar)

        textCategoria = view.findViewById(R.id.text_categoria)

        textCategoria.text = categoria
        textNome.text = usuario

        btnExecutar.setOnClickListener {
            val nome = editNome.text.toString()
            if (nome.isNotEmpty()) {
                textNome.text = nome
            }
        }

        return view
    }
}