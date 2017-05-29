package com.example.jesus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ventana3 extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana3);
        t=(TextView) findViewById(R.id.llama);
    }

    public void llamar(View v){
        t.setText("LLAMANDO...");
    }
    public void volver(View v){
        Intent i=new Intent(this,VENTANA2.class);
        startActivity(i);
    }
    public void dale(View v){
        Intent i=new Intent(this,ventana4.class);
        startActivity(i);
    }
}
