package com.example.tryingplusplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtName;
    private EditText edtText;

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnHello:
                txtName.setText("Hello " + edtText.getText().toString());
                break;
            case R.id.edtText:
                Toast.makeText(this, "clicked on edit text", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);

        edtText = findViewById(R.id.edtText);
        edtText.setOnClickListener(this);
        
        txtName = findViewById(R.id.txtName);
    }
}