package com.example.reversestr_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
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

        EditText string1;
        Button reverseBtn;


        string1 =(EditText) findViewById(R.id.string1);
        reverseBtn =(Button) findViewById(R.id.reverseBtn);


        reverseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable tempString = string1.getText();
                String reverseStr ="";
                char ch;

                for (int i=0; i<tempString.length(); i++)
                {
                    ch= tempString.charAt(i);
                    reverseStr= ch+reverseStr;
                }
                Toast.makeText(getApplicationContext(), "Reversed string is : "+reverseStr,Toast.LENGTH_LONG).show();
            }
        });
    }
}