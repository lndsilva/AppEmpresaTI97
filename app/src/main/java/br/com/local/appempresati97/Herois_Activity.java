package br.com.local.appempresati97;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Herois_Activity extends AppCompatActivity {
    //Criando a variavel global da ListView
    ListView listView;

    //Simular objetos que serão inseridos na lista.

    String nomeHerois[] = {"Homem de Ferro", "Capitão América",
            "Viuva Negra", "Thor", "Hulk", "Arqueiro", "Homem Formiga"};

    int imagemHerois[] = {R.drawable.ironman, R.drawable.capitao,
            R.drawable.viuva, R.drawable.thor, R.drawable.hulk, R.drawable.arqueiro,
            R.drawable.formiga};
    String descHerois[] = {
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
    };
    String valorHerois[] = {
            "9.8", "8.0", "9.5", "10.0", "8.6", "9.8", "9.5"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herois_layout);

        //Cuidado ao colocar no menu a Home e depois você retirar a AppBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Apresentar o xml ao java
        listView = findViewById(R.id.idListaHerois);

        //Instanciando a classe adapter;

        MyAdapter adapter = new MyAdapter();

        //inserir os itens do modelo na listview
        listView.setAdapter(adapter);
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

    //Criando a inner class para o adaptador da listView
    public class MyAdapter extends BaseAdapter {

        //Contar quantos objetos devem ser inseridos na lista
        @Override
        public int getCount() {
            return imagemHerois.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        //Inflar os componentes do modelo para serem inseridos na listView
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            //Declarando as variaveis que serão utilizadas no modelo.
            ImageView imgHerois;
            TextView txtTituloImagem, txtDescricaoImagem, txtModeloValor;
            Button btnModeloAcao;
            RatingBar rtnModeloImagem;

            View view = getLayoutInflater().inflate(R.layout.modelo_lista_herois, null);

            //Apresentar os componentes xml ao java

            txtTituloImagem = view.findViewById(R.id.txtTituloImagem);
            imgHerois = view.findViewById(R.id.imgModelo);
            txtDescricaoImagem = view.findViewById(R.id.txtDescricaoImagem);
            txtModeloValor = view.findViewById(R.id.txtModeloValor);

            //Carregando os valores nos componentes

            txtTituloImagem.setText(nomeHerois[position]);
            imgHerois.setImageResource(imagemHerois[position]);
            txtDescricaoImagem.setText(descHerois[position]);
            txtModeloValor.setText(valorHerois[position]);


            return view;
        }
    }
}