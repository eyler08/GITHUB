package com.example.jesus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ventana6 extends AppCompatActivity {

    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana6);
        tx=(TextView) findViewById(R.id.recibe);
        Bundle bundle = getIntent().getExtras();
        String dato=bundle.getString("MELA");
        tx.setText(dato);

    }
    public void retroceder(View v){
        Intent i=new Intent(this,ventana5.class);
        startActivity(i);
    }
    public void dale(View v){
        Intent i=new Intent(this,ventana7.class);
        startActivity(i);
    }
}
