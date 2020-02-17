package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    EditText etPanjang,etLebar,etTinggi;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        tvHasil = findViewById(R.id.tvHasil);
    }

    public void hitung(View view){
        float p = Float.parseFloat(etPanjang.getText().toString());
        float l = Float.parseFloat(etLebar.getText().toString());
        float t = Float.parseFloat(etTinggi.getText().toString());

        float hasil = p*l*t;

        tvHasil.setText(String.valueOf(hasil));
    }
}
