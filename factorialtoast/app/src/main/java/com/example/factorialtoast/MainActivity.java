package com.example.factorialtoast;
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
        Button factorialBtn;


        number =(EditText) findViewById(R.id.number1);
        factorialBtn =(Button) findViewById(R.id.factorialBtn);

        factorialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(number.getText().toString());
                int factorial = 1;
                for(int i = 1; i<=num; i++){
                    factorial = i * factorial;
                }
                Toast.makeText(getApplicationContext(), "Factorial is : "+Integer.toString(factorial),Toast.LENGTH_LONG).show();
            }
        });
    }
}