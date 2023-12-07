package com.example.hidrotrack_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciamos las variables
        Button btn12 = findViewById(R.id.btn12);
        Button btn13 = findViewById(R.id.btn13);
        Button btn14 = findViewById(R.id.btn14);
        Button btn15 = findViewById(R.id.btn15);
        Button btn16 = findViewById(R.id.btn16);

        //Vamos a poner a escuchar los botones
        //Primero el botón de Home a Consumption
        btn12.setOnClickListener(v -> {
            //Generamos el intent para ir a Consumo
            Intent irAConsu = new Intent(MainActivity.this, ActivityWaterConsumption.class);
            startActivity(irAConsu);
        });
        //Segundo el botón de Home a Tips
        btn13.setOnClickListener(v -> {
            //Generamos el intent para ir a Consejos
            Intent irATips = new Intent(MainActivity.this, ActivityTips.class);
            startActivity(irATips);
        });
        //Tercero el botón de Home a Progress
        btn14.setOnClickListener(v -> {
            //Generamos el intent para ir a Progreso
            Intent irAProgre = new Intent(MainActivity.this, ActivityProgress.class);
            startActivity(irAProgre);
        });
        //Cuarto el botón de Home a Info
        btn15.setOnClickListener(v -> {
            //Generamos el intent para ir a Información
            Intent irAInfo = new Intent(MainActivity.this, ActivityInfo.class);
            startActivity(irAInfo);
        });
        //Finalmente el botón de Home a Settings
        btn16.setOnClickListener(v -> {
            //Generamos el intent para ir a Configuración
            Intent irASet = new Intent(MainActivity.this, ActivitySettings.class);
            startActivity(irASet);
        });
    }
}