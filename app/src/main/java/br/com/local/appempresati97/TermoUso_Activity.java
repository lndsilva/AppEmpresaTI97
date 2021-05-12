package br.com.local.appempresati97;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class TermoUso_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.termo_uso_layout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_configuracoes, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mVoltar:
                startActivity(new Intent(getApplicationContext(), CadastroUsuario_Activity.class));
                finish();
                break;
            case R.id.mConfigurar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Configurar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mCompartilhar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Compartilhar",
                        Toast.LENGTH_SHORT).show();
                break;


        }


        return super.onOptionsItemSelected(item);
    }
}