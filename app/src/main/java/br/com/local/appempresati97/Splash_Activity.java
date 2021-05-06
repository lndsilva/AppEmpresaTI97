package br.com.local.appempresati97;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;


public class Splash_Activity extends AppCompatActivity {

    //Criando o método onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Está executando o método e carregando o layout
        setContentView(R.layout.splash_layout);

        /*
        //Criando um Toast -> uma mensagem para o usuário
        Toast.makeText(getApplicationContext(),
                "Testando o Toast",
                Toast.LENGTH_SHORT).show();*/

        //Implementado o splash

        Handler handler = new Handler();

        //Rodar o processo em tempo específico
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //um dos modos de abrir uma janela
                Intent intent = new Intent(getApplicationContext(), Login_Activity.class);
                startActivity(intent);
                //Fecha a janela em que estou
                finish();
            }
        }, 3000);


    }
}