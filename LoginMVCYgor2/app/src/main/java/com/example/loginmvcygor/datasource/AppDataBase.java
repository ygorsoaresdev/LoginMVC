package com.example.loginmvcygor.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.loginmvcygor.datamodel.UsuarioDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    SQLiteDatabase sqLiteDatabase ;

    public static final String DB_NAME = "app.sqlite";
    public static int version = 1 ;
    public AppDataBase(Context context) {
        super(context, DB_NAME, null, version);
        sqLiteDatabase = getWritableDatabase() ;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(UsuarioDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
