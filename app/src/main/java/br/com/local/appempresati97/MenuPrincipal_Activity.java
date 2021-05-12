package br.com.local.appempresati97;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipal_Activity extends AppCompatActivity {

    CardView idCardHerois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        idCardHerois = findViewById(R.id.idCardHerois);

        idCardHerois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Herois_Activity.class));
                finish();
            }
        });
    }
}