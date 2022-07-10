package com.example.swappingtoast;

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

        EditText number1,number2;
        Button swap;
        TextView r,r1,r2;

        number1 =(EditText) findViewById(R.id.number1);
        number2 =(EditText) findViewById(R.id.number2);
        swap =(Button) findViewById(R.id.swap);

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());

                //swapping
                int temp;
                temp = num1;
                num1 = num2;
                num2 = temp;

                Toast.makeText(getApplicationContext(), "After Swapping First Number is : "+Integer.toString(num1)+" AND Second Number is "+Integer.toString(num2),Toast.LENGTH_LONG).show();

            }
        });
    }
}



