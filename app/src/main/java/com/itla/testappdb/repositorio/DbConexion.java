package com.itla.testappdb.repositorio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbConexion extends SQLiteOpenHelper {


    private final static int VERSION = 1;
    private final static String NAME_DB = "androidescuela.db";


    public DbConexion(@Nullable Context context) {
        super(context, NAME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("CREATE TABLE \"estudiante\" (\"id\"\tINTEGER PRIMARY KEY AUTOINCREMENT,\"nombre\" TEXT NOT NULL,\"matricula\" TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
