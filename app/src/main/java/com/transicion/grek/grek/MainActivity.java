package com.transicion.grek.grek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText margenCalif, porc_valor, TAR, TAE, PROMEDIO;
    int escalaCalif, por_valor, TAR_valor, TAE_valor, PROMEDIO_valor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        margenCalif = (EditText) findViewById(R.id.et_escala);
        porc_valor = (EditText) findViewById(R.id.editText2);
        TAR = (EditText) findViewById(R.id.editText3);
        TAE = (EditText) findViewById(R.id.editText4);
        PROMEDIO = (EditText) findViewById(R.id.editText5);
    }

    public void visualizar(View v){
        if(margenCalif.getText().length() >= 1)
        {
            escalaCalif = Integer.parseInt(margenCalif.getText().toString());
        }

        if (porc_valor.getText().length() >= 1)
        {
            por_valor = Integer.parseInt(porc_valor.getText().toString());
        }
        if (TAR.getText().length() >= 1)
        {
            TAR_valor = Integer.parseInt(TAR.getText().toString());
        }
        if (TAE.getText().length() >= 1) {
            TAE_valor = Integer.parseInt(TAE.getText().toString());
        }


        PROMEDIO_valor = (por_valor/TAR_valor)*(TAE_valor);

        PROMEDIO.setText(""+PROMEDIO_valor);

        //Toast.makeText(this,""+escalaCalif+" - "+por_valor, Toast.LENGTH_LONG).show();


    }
}
