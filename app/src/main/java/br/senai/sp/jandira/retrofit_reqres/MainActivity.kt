package br.senai.sp.jandira.retrofit_reqres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //BOTÃO DE GET
        findViewById<Button>(R.id.btnGET).setOnClickListener{
            Log.e("GETTING-DATA", "Teste de Botão GET" )
        }

        //BOTÃO DE PUT
        findViewById<Button>(R.id.btnPUT).setOnClickListener{
            Log.e("PUTTING-DATA", "Teste de Botão PUT" )
        }
        //BOTÃO DE DELETE
        findViewById<Button>(R.id.btnDELETE).setOnClickListener{
            Log.e("DELETING-DATA", "Teste de Botão DELETE" )
        }
        //BOTÃO DE POST
        findViewById<Button>(R.id.btnPOST).setOnClickListener{
            Log.e("POSTING-DATA", "Teste de Botão POST" )
        }
    }

}