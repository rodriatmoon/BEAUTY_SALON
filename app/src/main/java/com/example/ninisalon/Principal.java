package com.example.ninisalon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Principal extends AppCompatActivity {

    CardView c1, c2, c3, c4, c5, c6, c7, c8, c9, c10 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.parseColor("#FFC107"));


        c1=findViewById(R.id.cardview1);
        c2=findViewById(R.id.cardview2);
        c3=findViewById(R.id.cardview3);
        c4=findViewById(R.id.cardview4);
        c5=findViewById(R.id.cardview5);
        c6=findViewById(R.id.cardview6);
        c7=findViewById(R.id.cardview7);
        c8=findViewById(R.id.cardview8);
        c9=findViewById(R.id.cardview9);
        c10=findViewById(R.id.cardview10);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String T = getString(R.string.Tratamiento1);
                String P = getString(R.string.Precio1);
                MostrarDialogo(T, P);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String T = getString(R.string.Tratamiento2);
                String P = getString(R.string.Precio2);
                MostrarDialogo(T, P);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String T = getString(R.string.Tratamiento3);
                String P = getString(R.string.Precio3);
                MostrarDialogo(T, P);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String T = getString(R.string.Tratamiento4);
                String P = getString(R.string.Precio4);
                MostrarDialogo(T, P);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String T = getString(R.string.Tratamiento5);
                String P = getString(R.string.Precio5);
                MostrarDialogo(T, P);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String T = getString(R.string.Tratamiento6);
                String P = getString(R.string.Precio6);
                MostrarDialogo(T, P);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String T = getString(R.string.Tratamiento7);
                String P = getString(R.string.Precio7);
                MostrarDialogo(T, P);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String T = getString(R.string.Tratamiento8);
                String P = getString(R.string.Precio8);
                MostrarDialogo(T, P);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String T = getString(R.string.Tratamiento9);
                String P = getString(R.string.Precio9);
                MostrarDialogo(T, P);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String T = getString(R.string.Tratamiento10);
                String P = getString(R.string.Precio10);
                MostrarDialogo(T, P);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.citas:
                return true;

            case R.id.history:

                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    private void MostrarDialogo(String Nombre, String Precio){
        AlertDialog.Builder builder= new AlertDialog.Builder(Principal.this);

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.agendar, null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        TextView txtN = view.findViewById (R.id.NTratamiento);
        txtN.setText (Nombre);
        TextView txtP = view.findViewById (R.id.PTratamiento);
        txtP.setText(Precio);
        Button btnAgendar = view.findViewById(R.id.btnagendar);

        btnAgendar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V) {

                Toast.makeText(getApplicationContext (), "Agendado con éxito.", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        Button btnCancelar = view.findViewById(R.id.btncancelar);

        btnCancelar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V) {
                Toast.makeText(getApplicationContext (), "Cancelado", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
    }
}