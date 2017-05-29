package com.example.jesus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class VENTANA2 extends AppCompatActivity {

    private String[] paises = { "Argentina", "Chile", "Paraguay", "Bolivia",
            "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela", "Uruguay" };
    private String[] habitantes = { "40000000", "17000000", "6500000",
            "10000000", "30000000", "14000000", "183000000", "44000000",
            "29000000", "3500000" };
    TextView text;
    ListView li;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        text=(TextView) findViewById(R.id.texto);
        li=(ListView) findViewById(R.id.lista);
        ArrayAdapter <String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paises);
        li.setAdapter(adapter);
        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                text.setText("Población de "+ li.getItemAtPosition(i) + " es "+ habitantes[i]);
            }
        });
    }

    public void volver(View v){
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
    }
    public void avanzar(View v){
        Intent i=new Intent(this,ventana3.class);
        startActivity(i);
    }
}
