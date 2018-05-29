package com.entorno.nextu.practica_datos_entre_activitys_suma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ventana2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        TextView resultado = (TextView) findViewById(R.id.resultado);
        int ingreso1 = getIntent().getIntExtra("ingreso1", 0);
        int ingreso2 = getIntent().getIntExtra("ingreso2", 0);
        resultado.setText("El resultado de la suma es:"+(ingreso1+ingreso2));
    }
}
