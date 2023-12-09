package com.example.hidrotrack_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityWaterConsumption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_consumption);

        //Instanciamos el botón de guardar
        Button btn2 = findViewById(R.id.btn2);

        //Instanciamos el botón de regresar a Home
        Button btn21 = findViewById(R.id.btn21);

        //Ponemos a escuchar al botón save
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Mostramos el mensaje de consumo guardado
                Toast.makeText(ActivityWaterConsumption.this, "Consumo guardado", Toast.LENGTH_SHORT).show();
                //Me va redirigir al progreso de mis consumos
                Intent irAProgress24 = new Intent(ActivityWaterConsumption.this, ActivityProgress.class);
                startActivity(irAProgress24);
            }
        });

        //Ponemos a escuchar al botón home
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Generamos el intent para cambiar de actividad
                Intent irAHome21 = new Intent(ActivityWaterConsumption.this, MainActivity.class);
                startActivity(irAHome21);
            }
        });

    }
}