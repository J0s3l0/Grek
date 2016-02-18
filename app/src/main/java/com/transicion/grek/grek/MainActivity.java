package com.transicion.grek.grek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText margenCalif, porc_valor;
    int escalaCalif, por_valor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        margenCalif = (EditText) findViewById(R.id.et_escala);
        porc_valor = (EditText) findViewById(R.id.editText2);









/*
        TextView tv_suma = (TextView) findViewById(R.id.tv_suma);
        int resultado = 0, a = 5, b = 2;
        resultado = a + b;
        tv_suma.setText(String.valueOf(resultado));

        TextView totalFrutas = (TextView) findViewById(R.id.tv_frutas);
        int resultado2 = 0, manzanas = 6, naranjas = 4;
        resultado2 = manzanas + naranjas;
        totalFrutas.setText("Total de frutas= "+String.valueOf(resultado2)+"!!!\n");

        int califEnrique = 79, califCarlos = 89, valor = 70;

        if(79 < valor )
        {
            totalFrutas.append("Enrique sigue participando\n");
        }
        else if(79 < 80)
        {
            totalFrutas.append("Enrique tienes C\n");
        }
        else if(79 < 90)
        {
            totalFrutas.append("Enrique tienes B\n");
        }
        else if(79 < 100)
        {
            totalFrutas.append("Enrique tienes A\n");
        }
        else
        {
            totalFrutas.append("Calificación inválida\n");
        }

        if(califCarlos < valor)
        {
            totalFrutas.append("Carlos sigue participando\n");
        }




*/

    }

    public void visualizar(View v){
        escalaCalif = Integer.parseInt(margenCalif.getText().toString());
        por_valor = Integer.parseInt(porc_valor.getText().toString());


        Toast.makeText(this,""+por_valor, Toast.LENGTH_LONG).show();


    }
}
