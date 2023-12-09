package com.example.hidrotrack_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityProgress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        //Instanciamos el botón de regresar a Home
        Button btn41 = findViewById(R.id.btn41);

        //Ponemos a escuchar al botón
        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Generamos el intent para cambiar de actividad
                Intent irAHome41 = new Intent(ActivityProgress.this, MainActivity.class);
                startActivity(irAHome41);
            }
        });

    }
}