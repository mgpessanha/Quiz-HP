package com.example.testeprova

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class Resultado : AppCompatActivity() {

    private lateinit var imgGrifinoria: ImageView
    private lateinit var imgLufalufa: ImageView
    private lateinit var imgCorvinal: ImageView
    private lateinit var imgSonserina: ImageView
    private lateinit var significadoCasa: TextView
    private lateinit var nomeCasa: TextView
    private lateinit var botaoSurpresa: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_res)

        val url = "https://www.tecmundo.com.br/minha-serie/216397-casas-hogwarts-conheca-caracteristicas-cada-delas.htm"
        val intentImp = Intent(Intent.ACTION_VIEW, Uri.parse(url))


        imgGrifinoria = findViewById<ImageView>(R.id.img_grifinoria)
        imgLufalufa = findViewById<ImageView>(R.id.img_lufalufa)
        imgCorvinal = findViewById<ImageView>(R.id.img_corvinal)
        imgSonserina = findViewById<ImageView>(R.id.img_sonserina)
        significadoCasa = findViewById<TextView>(R.id.significado_casa)
        nomeCasa = findViewById<TextView>(R.id.nome_casa)
        botaoSurpresa = findViewById<Button>(R.id.botao_surpresa)


        if (Data.casa_grifinoria > Data.casa_lufalufa && Data.casa_grifinoria > Data.casa_corvinal && Data.casa_grifinoria > Data.casa_sonserina) {
            imgGrifinoria.visibility = View.VISIBLE
            nomeCasa.text = "Grifinória"
            nomeCasa.visibility = View.VISIBLE
            significadoCasa.text = "Características: bravura, determinação, ousadia, cavalheirismo e coragem. Representada pelo leão e fundada por Godric´s Gryffindor."
            significadoCasa.visibility = View.VISIBLE

        } else if (Data.casa_sonserina > Data.casa_lufalufa && Data.casa_sonserina > Data.casa_corvinal && Data.casa_sonserina > Data.casa_grifinoria) {
            imgSonserina.visibility = View.VISIBLE
            nomeCasa.text = "Sonserina"
            nomeCasa.visibility = View.VISIBLE
            significadoCasa.text = "Características: ambição, orgulho, determinação, astúcia e criatividade. Representada pela cobra e fundada por Salazar Slytherin."
            significadoCasa.visibility = View.VISIBLE

        } else if (Data.casa_corvinal > Data.casa_lufalufa && Data.casa_corvinal > Data.casa_sonserina && Data.casa_corvinal > Data.casa_grifinoria) {
            imgCorvinal.visibility = View.VISIBLE
            nomeCasa.text = "Corvinal"
            nomeCasa.visibility = View.VISIBLE
            significadoCasa.text = "Características: sagacidade, inteligência, criatividade, desconfiança e aceitação. Representada pela águia e fundada por Rowena Ravenclaw."
            significadoCasa.visibility = View.VISIBLE

        } else {
            imgLufalufa.visibility = View.VISIBLE
            nomeCasa.text = "Lufa-Lufa"
            nomeCasa.visibility = View.VISIBLE
            significadoCasa.text = "Características: justiça, lealdade, paciência, pureza e sinceridade. Representada pelo texugo e fundada por Helga Hufflepuff."
            significadoCasa.visibility = View.VISIBLE

        }

        botaoSurpresa.setOnClickListener{
            startActivity(intentImp)
        }



    }
}