package com.example.appunidad0144

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MenuActivity : AppCompatActivity() {
    private lateinit var crvHola: CardView
    private lateinit var crvIMC: CardView
    private lateinit var crvConvGrados: CardView
    private lateinit var crvMoneda: CardView
    private lateinit var crvCotizacion: CardView
    private lateinit var crvSalir: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        iniciarComponentes()
        eventosClic()



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun iniciarComponentes(){
        crvHola = findViewById(R.id.crvHola)
        crvIMC = findViewById(R.id.crvIMC)
        crvConvGrados = findViewById(R.id.crvConvGrados)
        crvMoneda = findViewById(R.id.crvMoneda)
        crvCotizacion = findViewById(R.id.crvCotizacion)
        crvSalir = findViewById(R.id.crvSalir)
    }

    fun eventosClic(){
        crvHola.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        crvSalir.setOnClickListener {
            finish()
        }
    }
}