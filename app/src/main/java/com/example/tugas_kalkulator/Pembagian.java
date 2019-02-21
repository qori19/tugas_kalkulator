package com.example.tugas_kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pembagian extends AppCompatActivity {
    private Button btnBagi;
    private EditText X,Y;
    private TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembagian);

        btnBagi = findViewById(R.id.btn_hasil4);
        X = findViewById(R.id.angka1);
        Y = findViewById(R.id.angka2);
        hasil = findViewById(R.id.tv_hasil4);

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double p = Double.parseDouble(X.getText().toString());
                    double l = Double.parseDouble(Y.getText().toString());

                    double bagi = p / l;

                    hasil.setText(String.valueOf(bagi));
                }catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
