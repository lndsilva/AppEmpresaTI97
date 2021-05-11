package br.com.local.appempresati97;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroUsuario_Activity extends AppCompatActivity {
    //Declarando as variáveis globais
    Button btnCadUsu, btnVoltarLogin;
    TextView txtTermoUsu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_usuario_layout);

        //Apresentação do xml para o Java
        btnCadUsu = findViewById(R.id.btnCadUsuario);
        btnVoltarLogin = findViewById(R.id.btnVoltarLogin);
        txtTermoUsu = findViewById(R.id.txtTermoUsu);

        //Os eventos para os componentes do xml no Java

        //Botão cadastrar
        btnCadUsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Em processo de codificação",
                        Toast.LENGTH_SHORT).show();
            }
        });
        //Botão voltar para login
        btnVoltarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Login_Activity.class));
                finish();
            }
        });
        //Botão janela termo de uso
        txtTermoUsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TermoUso_Activity.class));
            }
        });

    }
}