package com.example.hidrotrack_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        //Instanciamos el botón de regresar a Home
        Button btn51 = findViewById(R.id.btn51);

        //Ponemos a escuchar al botón
        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Generamos el intent para cambiar de actividad
                Intent irAHome51 = new Intent(ActivityInfo.this, MainActivity.class);
                startActivity(irAHome51);
            }
        });

    }
}