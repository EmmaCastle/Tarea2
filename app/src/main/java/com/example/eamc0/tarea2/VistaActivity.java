package com.example.eamc0.tarea2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VistaActivity extends AppCompatActivity {
    TextView nombreT;
    TextView emailT;
    TextView descripcionT;
    TextView telefonoT;
    TextView fechaT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista);
        final String nombre = getIntent().getStringExtra("nombre");
        final String email = getIntent().getStringExtra("email");
        final String descripcion = getIntent().getStringExtra("descripcion");
        final String telefono = getIntent().getStringExtra("telefono");
        String fecha = getIntent().getStringExtra("fecha");
        nombreT= (TextView)findViewById(R.id.textViewNombre);
        emailT= (TextView)findViewById(R.id.textViewEmail);
        descripcionT = (TextView)findViewById(R.id.textViewDescripcion);
        fechaT = (TextView) findViewById(R.id.textViewFechaNacimiento);
        telefonoT = (TextView)findViewById(R.id.textViewTelefono);
        nombreT.setText(nombre);
        emailT.setText("Email: " + email);
        descripcionT.setText("Descripción: "+descripcion);
        telefonoT.setText("Tel. "+telefono);
        fechaT.setText("Fecha Nacimiento :"+ fecha);

        Button Editar = (Button)findViewById(R.id.buttonEditar);
        Editar.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                finish();
            }
        });
    }
}
