package com.example.hidrotrack_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class ActivitySplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Intanciamos la imagen
        ImageView splash = findViewById(R.id.splash);

        //Creamos la animacion fade_in
        Animation fadeIn_sp = new AlphaAnimation(0,1);
        //Configuramos la duración de la animación
        fadeIn_sp.setDuration(2000);
        //Iniciamos la animación
        splash.startAnimation(fadeIn_sp);

        //El análogo del Intent para Splash
        splash.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent irAHome = new Intent(ActivitySplash.this, MainActivity.class);
                startActivity(irAHome);
                finish();
            }
        },2000);
    }
    @Override
    protected void onDestroy () {
        super.onDestroy();
        ImageView splasj1 = findViewById(R.id.splash);
        splasj1.removeCallbacks(null);
    }
}