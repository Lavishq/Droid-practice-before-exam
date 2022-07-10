package com.example.squaretoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText number;
        Button squareBtn;

        number =(EditText) findViewById(R.id.number);
        squareBtn =(Button) findViewById(R.id.squareBtn);

        squareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(number.getText().toString());
                int square = num*num;
                Toast.makeText(getApplicationContext(), "Square is : "+Integer.toString(square),Toast.LENGTH_LONG).show();
            }
        });
    }
}