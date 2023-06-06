package com.example.testeprova

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivityPgtDois : AppCompatActivity() {

    private lateinit var grupo: RadioGroup
    private lateinit var botaoUm: RadioButton
    private lateinit var botaoDois: RadioButton
    private lateinit var botaoTres: RadioButton
    private lateinit var botaoQuatro: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_pgt2)


        grupo = findViewById<RadioGroup>(R.id.radio_group)
        botaoUm = findViewById<RadioButton>(R.id.radio_primeira)
        botaoDois = findViewById<RadioButton>(R.id.radio_segunda)
        botaoTres = findViewById<RadioButton>(R.id.radio_terceira)
        botaoQuatro = findViewById<RadioButton>(R.id.radio_quarta)

        fun proximaPagina() {
            val intent = Intent(this, MainActivityPgtTres::class.java)
            startActivity(intent)
        }

        botaoUm.setOnClickListener{
            Data.casa_lufalufa += 1
            proximaPagina()
        }

        botaoDois.setOnClickListener{
            Data.casa_corvinal += 1
            proximaPagina()
        }

        botaoTres.setOnClickListener{
            Data.casa_sonserina += 1
            proximaPagina()
        }

        botaoQuatro.setOnClickListener{
            Data.casa_grifinoria += 1
            proximaPagina()
        }


    }
}