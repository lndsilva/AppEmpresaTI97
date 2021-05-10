package br.com.local.appempresati97;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Activity extends AppCompatActivity {
    //Declarando variável global
    Button btnSair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //Apresentar o componente XML ao componente Java

        btnSair = findViewById(R.id.btnSair);

        //Realizar a ação de clique no btnSair através do Java

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Método para fechar a janela
                finish();

            }
        });


    }
}