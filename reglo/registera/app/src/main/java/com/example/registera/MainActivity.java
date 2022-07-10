package com.example.registera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, password, email, passcon;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password1);
        passcon = findViewById(R.id.password);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aname = name.getText().toString();
                String aemail = email.getText().toString();
                Intent intent = new Intent(MainActivity.this, reg_success.class);
                intent.putExtra("rname", aname);
                intent.putExtra("remail", aemail);
                startActivity(intent);
            }
        });
    }
}
