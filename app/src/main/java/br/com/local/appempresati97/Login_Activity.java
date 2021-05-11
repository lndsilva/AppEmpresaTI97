package br.com.local.appempresati97;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Login_Activity extends AppCompatActivity {
    //Declarando variável global
    Button btnSair, btnLogin;
    TextView txtRecuperaSenha;
    TextInputEditText txtEmail, txtSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //Apresentar o componente XML ao componente Java

        btnSair = findViewById(R.id.btnSair);
        txtRecuperaSenha = findViewById(R.id.txtRecuperaSenha);
        btnLogin = findViewById(R.id.btnLogin);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);

        //Realizar a ação de clique no btnSair através do Java

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email, senha;

                email = txtEmail.getText().toString();
                senha = txtSenha.getText().toString();

                //Estrutura de decisão para acesso a janela de menu com base no usuário ou senha

                if (email.equals("usuario@sp.senac.br") && senha.equals("senac")) {
                    //Toast.makeText(getApplicationContext(), "Bem vindo ao sistema",Toast.LENGTH_SHORT).show();
                    //Abrindo a janela do menu com base no usuário e senha válidos.
                    startActivity(new Intent(getApplicationContext(), MenuPrincipal_Activity.class));
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos!!!",
                            Toast.LENGTH_SHORT).show();
                    limparTela();
                }


            }
        });

        txtRecuperaSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RecuperarUsuario_Activity.class));
                finish();
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fechar a janela
                finish();
            }
        });
    }

    //método limpar tela e recuar o cursor
    public void limparTela() {
        txtEmail.setText("");
        txtSenha.setText("");
        txtEmail.requestFocus();
    }


    public void abrirCadUsuario(View view) {
        //abrir a janela de cadastro de usuário
        startActivity(new Intent(getApplicationContext(), CadastroUsuario_Activity.class));
        finish();
    }
}