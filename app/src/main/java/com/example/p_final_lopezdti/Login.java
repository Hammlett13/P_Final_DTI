package com.example.p_final_lopezdti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    public Button btnAccesar;

    public EditText etUsuario, etContra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = findViewById(R.id.etUsuario);
        etContra = findViewById(R.id.etContra);
        btnAccesar = findViewById(R.id.btnAcces);

        btnAccesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etUsuario.getText().toString().equals("admin") && etContra.getText().toString().equals("udl123")){
                    Intent intent1 = new Intent(view.getContext(),MainActivity.class);
                    startActivityForResult(intent1, 0);
                }
                else{
                    Toast.makeText(Login.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}