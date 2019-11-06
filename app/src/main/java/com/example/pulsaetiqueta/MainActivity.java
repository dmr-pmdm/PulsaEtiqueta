package com.example.pulsaetiqueta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSaludo = findViewById(R.id.txtMensaje);

        txtSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSaludo.setBackgroundColor(getResources().getColor(R.color.fondo));
                txtSaludo.setTextColor(getResources().getColor(R.color.texto));
                txtSaludo.setRotation(15);
            }
        });
    }
}
