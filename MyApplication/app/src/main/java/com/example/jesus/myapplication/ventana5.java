package com.example.jesus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ventana5 extends AppCompatActivity {

    EditText et1,et2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana5);
        et1=(EditText)findViewById(R.id.editText4);
        et2=(EditText)findViewById(R.id.editText5);
    }
    public void verificar(View v) {
        String clave=et2.getText().toString();
        if (clave.length()==0) {
            Toast notificacion= Toast.makeText(this,"La clave no puede quedar vacía", Toast.LENGTH_LONG);
            notificacion.show();
        }else{
            Intent i=new Intent(this,ventana6.class);
            i.putExtra("MELA", et1.getText().toString());
            startActivity(i);
        }
    }
    public void retroceder(View v){
        Intent i=new Intent(this,ventana4.class);
        startActivity(i);
    }
    public void dale(View v){
        Intent i=new Intent(this,ventana6.class);
        startActivity(i);
    }
}
