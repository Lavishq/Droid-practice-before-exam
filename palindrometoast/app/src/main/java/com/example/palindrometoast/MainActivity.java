package com.example.palindrometoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private EditText num1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= findViewById(R.id.btn);
        num1= findViewById(R.id.value);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number = Integer.parseInt(num1.getText().toString());

                int r, sum = 0, temp;
                temp = number;
                while (number>0) {

                    r = number % 10;
                    sum = (sum * 10) + r;
                    number = number / 10;
                }

                if (temp == sum) {

                    Toast.makeText(MainActivity.this, Integer.toString(temp) + " is a palindrome number", Toast.LENGTH_SHORT).show();

                } else {

                    Toast.makeText(MainActivity.this, Integer.toString(temp) + " is not a palindrome number", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}