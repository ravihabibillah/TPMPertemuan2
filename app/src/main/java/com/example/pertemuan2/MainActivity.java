package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNama ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.nama);

    }

    public void next(View view){
        Intent intent = new Intent(MainActivity.this,NextActivity.class);
        intent.putExtra("nama",etNama.getText().toString());
        startActivity(intent);
    }
}
