package com.example.eamc0.tarea2;

import android.content.Intent;
import android.icu.text.DateFormat;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityRegistro extends AppCompatActivity {
    EditText nombre;
    EditText email;
    EditText descripcion;
    EditText telefono;
    DatePicker fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
            Button siguiente = (Button)findViewById(R.id.buttonSiguiente);
            nombre= (EditText)findViewById(R.id.editTextNombre);
            email= (EditText)findViewById(R.id.editTextEmail);
            descripcion = (EditText)findViewById(R.id.editTextDescripcion);
            fecha = (DatePicker) findViewById(R.id.datePickerFecha);
            telefono = (EditText)findViewById(R.id.editTextTelefono);
            siguiente.setOnClickListener(new View.OnClickListener(){
                @Override
                public  void onClick(View v){
                    Integer dia, mes, año;
                    dia = fecha.getDayOfMonth();
                    mes = fecha.getMonth();
                    año = fecha.getYear();

                    Intent intent  = new Intent(ActivityRegistro.this , VistaActivity.class);
                    intent.putExtra("nombre", nombre.getText().toString());
                    intent.putExtra("fecha", dia+"/"+mes+"/"+año);
                    intent.putExtra("telefono", telefono.getText().toString());
                    intent.putExtra("email", email.getText().toString());
                    intent.putExtra("descripcion", descripcion.getText().toString());
                    startActivity(intent);
                }
            });
        }
}
