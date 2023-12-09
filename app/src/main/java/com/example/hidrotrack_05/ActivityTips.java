package com.example.hidrotrack_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        //Instanciamos el botón de regresar a Home
        Button btn31 = findViewById(R.id.btn31);

        //Ponemos a escuchar al botón
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Generamos el intent para cambiar de actividad
                Intent irAHome31 = new Intent(ActivityTips.this, MainActivity.class);
                startActivity(irAHome31);
            }
        });

    }
}