package com.example.jesus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ventana4 extends AppCompatActivity {

    EditText et1;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana4);
        et1=(EditText)findViewById(R.id.editText3);
        num=(int)(Math.random()*100001);
        String cadena=String.valueOf(num);
        Toast notificacion= Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.show();
    }

    public void controlar(View v) {
        String valorIngresado=et1.getText().toString();
        int valor=Integer.parseInt(valorIngresado);
        if (valor==num) {
            Toast notificacion=Toast.makeText(this,"Muy bien recordaste el número mostrado.",Toast.LENGTH_LONG);
            notificacion.show();
        }
        else {
            Toast notificacion=Toast.makeText(this,"Lo siento pero no es el número que mostré.",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }

    public void retroceder(View v){
        Intent i=new Intent(this,ventana3.class);
        startActivity(i);
    }
    public void dale(View v){
        Intent i=new Intent(this,ventana5.class);
        startActivity(i);
    }
}
