package com.example.ninisalon;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CItas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas);
        TextView Trt, Prc, Fch;
        Trt = (TextView) findViewById(R.id.txtTratamientocitas);
        Prc = (TextView) findViewById(R.id.txtPreciocitas);
        Fch = (TextView) findViewById(R.id.txtFechacitas);

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        Cursor fila = bd.rawQuery("select tratamiento, precio ,fecha from citas", null);
        if (((Cursor) fila).moveToLast()) {
            Trt.setText(fila.getString(0));
            Prc.setText(fila.getString(1));
            Fch.setText(fila.getString(2));
        } else{
            Toast.makeText(this, "No existen citas",Toast.LENGTH_SHORT).show();
            bd.close();
        }

    }
}