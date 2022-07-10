package com.example.armstrongtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.armstrongbtn);
        e1=findViewById(R.id.number);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int inputvalue= Integer.parseInt(e1.getText().toString());

                int number, temp, total=0;
                number=inputvalue;

                while (number != 0){

                    temp= number%10;
                    total= total+temp*temp*temp;
                    number= number/10;

                }

                if (total == inputvalue){

                    Toast.makeText(MainActivity.this,Integer.toString(inputvalue) +  " is an armstrong number",Toast.LENGTH_SHORT).show();
                }

                else  {

                    Toast.makeText(MainActivity.this,Integer.toString(inputvalue) +  " is not an armstrong number",Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}