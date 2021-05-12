package br.com.local.appempresati97;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Herois_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herois_layout);

        //Cuidado ao colocar no menu a Home e depois você retirar a AppBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //Criar o menu e inserir no Appbar da janela do aplicativo
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_herois, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //Criando ações para o menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mHeroisCadastrar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Cadastrar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHeroisAlterar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Alterar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHeroisApagar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Deletar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHeroisPesquisar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Pesquisar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHeroisSalvarComo:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Salvar Como",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHeroisSalvarTudo:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Salvar Tudo",
                        Toast.LENGTH_SHORT).show();
                break;


        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {


        super.onBackPressed();
    }
}