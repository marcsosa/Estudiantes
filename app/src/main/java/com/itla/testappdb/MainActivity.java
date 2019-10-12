package com.itla.testappdb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itla.testappdb.entidades.Estudiante;
import com.itla.testappdb.repositorio.EstudianteRepositorio;
import com.itla.testappdb.repositorio.EstudianteRepositorioDblmpl;


public class MainActivity extends AppCompatActivity {
Button guardar;
Button cancelar;
EditText nombre;
EditText matricula;

    EstudianteRepositorio estudianteRepositorio;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guardar = (Button)findViewById(R.id.btnguardar);
        cancelar = (Button)findViewById(R.id.btcancelar);
        nombre = (EditText) findViewById(R.id.etnombre);
        matricula = (EditText) findViewById(R.id.etmatricula);
        estudianteRepositorio = new EstudianteRepositorioDblmpl(this.getBaseContext());

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Estudiante est1 = new Estudiante();
                est1.setNombre(nombre.getText().toString());
                est1.setMatricula(matricula.getText().toString());

                estudianteRepositorio.crear(est1);
            }
        });
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText("");
                matricula.setText("");
            }
        });



    }



}
