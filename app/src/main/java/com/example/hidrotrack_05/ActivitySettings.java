package com.example.hidrotrack_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivitySettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //Instanciamos el botón de guardar
        Button btn6 = findViewById(R.id.btn6);

        //Instanciamos el botón de regresar a Home
        Button btn61 = findViewById(R.id.btn61);

        //Instanciamos con la parte visual / diseño
        Spinner sp6 = findViewById(R.id.sp6);

        //Creamos el elemento que va contener la lista
        ArrayList<String> opciones = new ArrayList<>();

        //Agregamos los elementos a la lista de 'opciones'
        opciones.add("Grupo 01");
        opciones.add("Grupo 02");
        opciones.add("Grupo 03");
        opciones.add("Grupo 04");
        opciones.add("Grupo 05");

        //Creamos el método que inserte la lista en el spinner
        ArrayAdapter<String> adap6 = new ArrayAdapter<>(this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,opciones);

        //Insertamos el adaptador al spinner, desplazamiento vertical
        sp6.setAdapter(adap6);

        //Ponemos a escuchar al botón save
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Mostramos el mensaje de consumo guardado
                Toast.makeText(ActivitySettings.this, "Configuración Aplicada", Toast.LENGTH_SHORT).show();
                //Me va redirigir al progreso de mis consumos
                Intent irAProgress62 = new Intent(ActivitySettings.this, ActivityWaterConsumption.class);
                startActivity(irAProgress62);
            }
        });

        //Ponemos a escuchar al botón home
        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Generamos el intent para cambiar de actividad
                Intent irAHome61 = new Intent(ActivitySettings.this, MainActivity.class);
                startActivity(irAHome61);
            }
        });

    }
}