package com.example.p_final_lopezdti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {



    public ListView lvVacantes;

    private String [] ofertas = {"Practicante Desarollo Web", "Practicante BI", "Practicante Base de datos", "Becario Desarrollo Móvil"};
    private String [] turnos = {"Matutino", "Vespertino", "Vespertino", "Vespértino"};
    private String [] sueldo = {"Apoyo económico para pasajes", "$3,000", "$5,500", "$6,500"};
    private String [] info = {"Se solicita practicante para el área de desarrollo web", "Vacante para practicante enfocado en inteligencia de negocios con Excel avanzado", "Se busca practicante para manejo de bases de datos", "Se solicita becario con ganas de aprender en la especialización de desarrollo móvil"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvVacantes = (ListView)findViewById(R.id.lvVacantes);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ofertas);
        lvVacantes.setAdapter(adapter);

        lvVacantes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String vacanteSeleccionada = ofertas[position];
                String turnoSeleccionado = turnos[position]; // Obtener el turno correspondiente a la vacante seleccionada
                String sueldoSeleccionado = sueldo[position]; // Obtener el sueldo correspondiente a la vacante seleccionada
                String infoSeleccionada = info[position];

                Intent intent = new Intent(MainActivity.this, detalles.class); // Crear el intent
                intent.putExtra("vacante", vacanteSeleccionada); // Agregar la vacante seleccionada como valor extra
                intent.putExtra("turno", turnoSeleccionado); // Agregar el turno correspondiente como valor extra
                intent.putExtra("sueldo", sueldoSeleccionado); // Agregar el sueldo correspondiente como valor extra
                intent.putExtra("info", infoSeleccionada); // Agregar la información correspondiente como valor extra
                startActivity(intent);
            }
        });
    }
}