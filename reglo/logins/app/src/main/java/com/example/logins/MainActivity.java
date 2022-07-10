package com.example.logins;

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
    EditText uname, password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = findViewById(R.id.uname);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String unam = uname.getText().toString();
                String passwed = password.getText().toString();

//                    Intent intent = new Intent(MainActivity.this, success.class);
//                    intent.putExtra("text", aname);
//                    intent.putExtra("remail", aemail);
//                    startActivity(intent);

                if(unam.equals("vishal")){
                    if(passwed.equals("1234")){
                        Intent i = new Intent(MainActivity.this, success.class);
                        i.putExtra("text","login successful");
                        startActivity(i);
//                        startActivity(new Intent(MainActivity.this, success.class);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "wrong password!try again",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "wrong username!try again",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}