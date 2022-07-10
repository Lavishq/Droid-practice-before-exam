package com.example.registera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class reg_success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_success);

        TextView rname = findViewById(R.id.rname);
        TextView remail = findViewById(R.id.remail);

        Intent intent= getIntent();
        String rsname = intent.getStringExtra("rname");
        String rsemail = intent.getStringExtra("remail");

        rname.setText("Name: " +rsname);
        remail.setText("Email: " +rsemail);
    }
}