package com.example.appunidad0144

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    /*
        declarar variables var nombre: Tipo = 0
                           val nombre: Tipo = 333
                           lateint // posteriormente inicia el objeto
     */

    private lateinit var txtSalida: TextView
    private lateinit var txtNombre: EditText
    private lateinit var btnSaludar: Button
    private lateinit var btnLimpiar: Button
    private lateinit var btnSalir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        iniciarComponentes()
        eventosClic()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun iniciarComponentes(){
        txtSalida = findViewById(R.id.txtSalida)
        txtNombre = findViewById(R.id.txtNombre)
        btnSaludar = findViewById(R.id.btnSaludar)
        btnLimpiar = findViewById(R.id.btnLimpiar)
        btnSalir = findViewById(R.id.btnSalir)
    }

    fun eventosClic(){
        btnSaludar.setOnClickListener {
            var strMensaje:String=""
            // Validar
            if (txtNombre.text.contentEquals("")){
                Toast.makeText(this, "Falto capturar el nombre",
                    Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            strMensaje = "¡ Hola ! " + txtNombre.text.toString() + " ¿Cómo estás?"
            txtSalida.text = strMensaje.toString()
        }

        btnLimpiar.setOnClickListener {
            txtSalida.text =""
            txtNombre.setText("")
        }

        btnSalir.setOnClickListener {
            this.finish()
        }
    }

}