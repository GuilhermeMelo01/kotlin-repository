package io.github.guilhermemelo01.alcoolougasolina

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.lang.Double
import java.lang.Math.floorDiv

class MainActivity : AppCompatActivity() {

    private lateinit var textInputAlcool: TextInputLayout
    private lateinit var editAlcool: TextInputEditText

    private lateinit var textInputGasolina: TextInputLayout
    private lateinit var editGasolina: TextInputEditText

    private lateinit var btnCalcular: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        inicializarComponentesInterface()
        btnCalcular.setOnClickListener {
            calcularMelhorPreco()
        }
    }

    private fun calcularMelhorPreco() {
        val precoAlcool = editAlcool.text.toString()
        val precoGasolina = editGasolina.text.toString()

        val resultadoValidacao = validarCampos(precoAlcool, precoGasolina)

        if (resultadoValidacao){
            if (precoAlcool.toDouble() / precoGasolina.toDouble() >= 0.7){
                textResultado.text = "É melhor usar gasolina"
            }else{
                textResultado.text = "É melhor usar álcool"
            }
        }

    }

    private fun validarCampos(precoAlcool: String, precoGasolina: String): Boolean {

        textInputAlcool.error = null
        textInputGasolina.error = null

        if (precoAlcool.isEmpty()) {
            textInputAlcool.error = "Digite o preço do álcool"
            return false
        }
        if (precoGasolina.isEmpty()) {
            textInputGasolina.error = "Digite o preço da gasolina"
            return false;
        }

        return true;
    }

    private fun inicializarComponentesInterface() {
        textInputAlcool = findViewById(R.id.text_input_alcool)
        editAlcool = findViewById(R.id.edit_alcool)

        textInputGasolina = findViewById(R.id.text_input_gasolina)
        editGasolina = findViewById(R.id.edit_gasolina)

        btnCalcular = findViewById(R.id.btn_calcular)
        textResultado = findViewById(R.id.text_resultado)
    }
}