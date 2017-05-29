package com.example.jesus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    TextView resul;
    RadioButton r1,r2;
    CheckBox m;
    Spinner opt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.editText);
        num2=(EditText)findViewById(R.id.editText2);
        resul=(TextView) findViewById(R.id.textView2);
        r1=(RadioButton) findViewById(R.id.radioButton3);
        r2=(RadioButton) findViewById(R.id.radioButton4);
        m=(CheckBox) findViewById(R.id.checkBox);
        opt=(Spinner) findViewById(R.id.spinner);
        String []option={"SUMAR","RESTAR","MULTIPLICAR"};
        ArrayAdapter <String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,option);
        opt.setAdapter(adapter);
    }

    public void sumar(View v){
        double n1= Double.parseDouble(num1.getText().toString());
        double n2= Double.parseDouble(num2.getText().toString());
        double total= 0;
      /* opcion para radiobutton y check
      if(r1.isChecked()==true){
            total=n1+n2;
        }else if(r2.isChecked()==true){
            total=n1-n2;
        }
        if(m.isChecked()==true){
            total=n1*n2;
        } */
       //uso de spinner;
        String selec=opt.getSelectedItem().toString();
        if(selec.equals("SUMAR")){
            total=n1+n2;
        }else if(selec.equals("RESTAR")){
            total=n1-n2;
        }else if(selec.equals("MULTIPLICAR")){
            total=n1*n2;
        }
        resul.setText(String.valueOf(total)+"  ");
    }

    public void avanzar(View v){
        Intent i = new Intent(this, VENTANA2.class );
        startActivity(i);
    }
}
