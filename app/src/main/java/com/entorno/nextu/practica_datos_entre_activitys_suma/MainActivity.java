package com.entorno.nextu.practica_datos_entre_activitys_suma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText ingreso1;
    private EditText ingreso2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingreso1 = (EditText) findViewById(R.id.ingreso1);
        ingreso2 = (EditText) findViewById(R.id.ingreso2);

    }
    public void sumar (View view){
    Intent intent = new Intent(this, ventana2.class );
    if (ingreso1.getText().toString().equals("")|| ingreso2.getText().toString().equals("")){
            intent.putExtra("ingreso1", 0 );
            intent.putExtra("ingreso2", 0);

        }else {
            intent.putExtra("ingreso1", Integer.parseInt(ingreso1.getText().toString()));
            intent.putExtra("ingreso2", Integer.parseInt(ingreso2.getText().toString()));
        }
        startActivity(intent);
    }
}
