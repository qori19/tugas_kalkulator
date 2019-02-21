package com.example.tugas_kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button Tambah, Kurang, Kali, Bagi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tambah = findViewById(R.id.tambah);
        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Penjumlahan.class);
                startActivity(intent);
            }
        });
        Kurang = findViewById(R.id.kurang);
        Kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pengurangan.class);
                startActivity(intent);
            }
        });
        Bagi = findViewById(R.id.bagi);
        Bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pembagian.class);
                startActivity(intent);
            }
        });
        Kali = findViewById(R.id.kali);
        Kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Perkalian.class);
                startActivity(intent);
            }
        });
    }
}
