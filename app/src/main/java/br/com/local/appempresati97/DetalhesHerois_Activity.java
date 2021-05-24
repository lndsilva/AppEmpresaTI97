package br.com.local.appempresati97;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalhesHerois_Activity extends AppCompatActivity {
    ImageView imgHerois;
    TextView dTituloHeroeis, dDescricaoHerois, dRatingHerois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalhes_herois_layout);

        //Declarando o xml para o java receber
        imgHerois = findViewById(R.id.imgDetalhesHerois);
        dTituloHeroeis = findViewById(R.id.txtDetalhesTituloHeroi);
        dDescricaoHerois = findViewById(R.id.txtDescDetalhesHeroi);
        dRatingHerois = findViewById(R.id.txtRatingDetalhesHeroi);

        //Criando o intent para receber os valores
        Intent intent = getIntent();

        int imagem;
        String titulo, descricao, valor;

        // imgHerois.setImageDrawable();

    }
}