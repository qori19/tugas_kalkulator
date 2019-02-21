package com.example.tugas_kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Perkalian extends AppCompatActivity {
    private Button btnKali;
    private EditText X,Y;
    private TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);

        btnKali = findViewById(R.id.btn_hasil3);
        X = findViewById(R.id.angka1);
        Y = findViewById(R.id.angka2);
        hasil = findViewById(R.id.tv_hasil3);

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double p = Double.parseDouble(X.getText().toString());
                    double l = Double.parseDouble(Y.getText().toString());

                    double kali = p * l;

                    hasil.setText(String.valueOf(kali));
                }catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
