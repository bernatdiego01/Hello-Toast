 package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
     private int pulsador=0;
     TextView incrementar=findViewById(R.id.contador);



     Button btmas=findViewById(R.id.botonMas);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pulsador++;
                incrementar.setText(pulsador);
            }
        });

    }

}