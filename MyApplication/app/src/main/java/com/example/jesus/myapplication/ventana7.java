package com.example.jesus.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ventana7 extends AppCompatActivity {
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana7);
        et1=(EditText)findViewById(R.id.et1);
        SharedPreferences prefe=getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(prefe.getString("mail",""));
    }

    public void ejecutar(View v) {
        SharedPreferences preferencias=getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString("mail", et1.getText().toString());
        editor.commit();
        finish();
    }
    public void retroceder(View v){
        Intent i=new Intent(this,ventana6.class);
        startActivity(i);
    }
    public void dale(View v){
        Intent i=new Intent(this,ventana8.class);
        startActivity(i);
    }
}
