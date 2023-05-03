package com.example.p_final_lopezdti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class detalles extends AppCompatActivity {

    public TextView tvVacante;
    public TextView tvTurno;
    public TextView tvSueldo;
    public TextView tvInfo;

    public Button btnApli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        String vacanteSeleccionada = getIntent().getStringExtra("vacante");
        String turnoSeleccionado = getIntent().getStringExtra("turno");
        String sueldoSeleccionado = getIntent().getStringExtra("sueldo");
        String infoSeleccionada = getIntent().getStringExtra("info");

        tvVacante = findViewById(R.id.tvVacante);
        tvVacante.setText(vacanteSeleccionada);

        tvTurno = findViewById(R.id.tvTurno);
        tvTurno.setText(turnoSeleccionado);

        tvSueldo = findViewById(R.id.tvSueldo);
        tvSueldo.setText(sueldoSeleccionado);

        tvInfo = findViewById(R.id.tvInfo);
        tvInfo.setText(infoSeleccionada);

        btnApli = findViewById(R.id.btnAplicar);
        btnApli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detalles.this, Aplicar.class);
                startActivity(intent);
            }
        });

    }
}