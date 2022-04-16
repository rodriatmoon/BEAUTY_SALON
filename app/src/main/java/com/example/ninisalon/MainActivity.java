package com.example.ninisalon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity<cardView> extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask splash = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Principal.class);
                startActivity(intent);
                finish();
            }
        };
        Timer t = new Timer();
        t.schedule(splash, 5000);
    }
}