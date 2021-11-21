package com.diendi.esperienziometro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.set


const val EXTRA_MESSAGE = "com.diendi.esperienziometro.MESSAGE"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getMonete(input: EditText): Int{
        return Integer.parseInt(input.text.toString())
    }

    fun calc(view: View){

        val inputRame = findViewById<EditText>(R.id.editRame)
        val inputArgento = findViewById<EditText>(R.id.editArgento)
        val inputElectrum = findViewById<EditText>(R.id.editElectrum)
        val inputPlatino = findViewById<EditText>(R.id.editPlatino)


        val rame = getMonete (inputRame)
        val argento:Int = getMonete(inputArgento)
        val electrum:Int = getMonete(inputElectrum)
        val platino:Int = getMonete(inputPlatino)

        val xp = ((rame / 100) + (argento / 10) + (electrum / 2) + (platino * 5))
        val punti = findViewById<TextView>(R.id.xpView)
        punti.text = xp.toString()
        inputRame.setText(Integer.toString(0))
        inputArgento.setText(Integer.toString(0))
        inputElectrum.setText(Integer.toString(0))
        inputPlatino.setText(Integer.toString(0))





        //val message = editText.text.toString()

    }


}