package br.com.opet.tds.pokeapiapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import br.com.opet.tds.pokeapiapp.R;

public class MainActivity extends Activity {

    private TextView textInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInfo = findViewById(R.id.infoPokemon);
    }

    public void buscarPokemon(View view) {
        if (textInfo.getText().length() == 0){
            Toast.makeText(this, "Informe o nome ou número para pesquisa!", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(MainActivity.this, InfoActivity.class);
            i.putExtra("INFO", textInfo.getText().toString());
            startActivity(i);
        }
    }
}
