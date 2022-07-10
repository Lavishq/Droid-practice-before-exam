package com.example.additiontoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText e1,e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.press);
        e1=(EditText) findViewById(R.id.num1);
        e2=(EditText) findViewById(R.id.num2);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());

                int sum = n1 + n2;

                Toast.makeText(MainActivity.this,"addition of two numbers is " + Integer.toString(sum),Toast.LENGTH_SHORT).show();
            }
        });




    }
}