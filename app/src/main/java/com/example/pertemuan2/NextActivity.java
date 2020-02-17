package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView tvNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        tvNama = findViewById(R.id.tvNama);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("nama");
        tvNama.setText("Halo " + nama + " !!");
    }

    public void last(View view){
        Intent intent = new Intent(NextActivity.this,LastActivity.class);
        startActivity(intent);
    }
}
