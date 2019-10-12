package com.itla.testappdb.repositorio;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.itla.testappdb.entidades.Estudiante;
import java.util.List;


public class EstudianteRepositorioDblmpl implements EstudianteRepositorio {

    private DbConexion dbConexion;

    public EstudianteRepositorioDblmpl(Context context) {
        this.dbConexion = new DbConexion(context);
    }

    @Override
    public void crear(Estudiante estudiante) {

        ContentValues cv = new ContentValues();
        cv.put("nombre", estudiante.getNombre());
        cv.put("matricula", estudiante.getMatricula());

        SQLiteDatabase db = dbConexion.getWritableDatabase();
       long id = db.insert("estudiante",null,cv );
       if (id <= 0) {
           Log.i("EstudianteRepositorio","Ocurrio un error al crear el estudiante");
       } else {
           Log.i("EstudianteRepositorio", "El estudiante se ha creado exitoso id=" + id);
       }
    }

    @Override
    public void actualizar(Estudiante estudiante) {

    }

    @Override
    public void borrar(Estudiante estudiante) {

    }

    @Override
    public void buscar(Estudiante estudiante) {

    }

    @Override
    public Estudiante buscar(int id) {
        return null;
    }

    @Override
    public List<Estudiante> buscar() {
        return null;
    }
}
