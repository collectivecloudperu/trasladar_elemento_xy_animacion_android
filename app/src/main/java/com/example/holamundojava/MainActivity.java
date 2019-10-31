package com.example.holamundojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Texto
        TextView txt = findViewById(R.id.txt_home);

        // Animación
        TranslateAnimation an = new TranslateAnimation(0.0f, 0.0f, 1600.0f, 0.0f);
        an.setDuration(1000);
        txt.startAnimation(an);
    }

}
