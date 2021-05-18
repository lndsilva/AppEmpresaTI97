package br.com.local.appempresati97;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class PerfilUsuario_Activity extends AppCompatActivity {

    MaterialToolbar idAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_usuario_layout);

        idAppBar = findViewById(R.id.idAppBar);

        //Clique do NavigationBar ou a seta de retorno
        idAppBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no retornar",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Implementando o clique no menu do perfil do usuário na AppBar - Toolbar
        idAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mEditar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no editar perfil",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mCompPerfil:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Compartilhar perfil",
                                Toast.LENGTH_SHORT).show();

                        break;
                }

                return false;
            }
        });

    }

}