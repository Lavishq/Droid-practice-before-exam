package com.example.cubetoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1;
        EditText v1;

        b1=(Button) findViewById(R.id.btn);
        v1=(EditText) findViewById(R.id.view);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a = Integer.parseInt(v1.getText().toString());

                int cube = a*a*a;

                Toast.makeText(MainActivity.this,Integer.toString(cube) + " is the cube of " + Integer.toString(a),Toast.LENGTH_SHORT).show();
            }
        });

    }
}