package com.example.checknradio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox hey,then,hello;
    private RadioGroup rg;

    private ProgressBar prob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hey = findViewById(R.id.hey);
        then = findViewById(R.id.then);
        hello = findViewById(R.id.hello);

        rg = findViewById(R.id.rg);

        prob = findViewById(R.id.prob);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++){
                    prob.incrementProgressBy(10);
//                    Thread.sleep(1000);//dk why this not works
                    SystemClock.sleep(1000);
                }
            }
        });
        thread.start();

        int checked = rg.getCheckedRadioButtonId();
        switch (checked){
            case R.id.radio:
                Toast.makeText(MainActivity.this, "Radio", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkbox:
                Toast.makeText(MainActivity.this, "Checkbox", Toast.LENGTH_SHORT).show();
                break;
            case R.id.none:
                Toast.makeText(MainActivity.this, "None", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radio:
                        Toast.makeText(MainActivity.this, "Radio", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.checkbox:
//                        prob.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Checkbox", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.none:
//                        prob.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this, "None", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        if (hey.isChecked()) {
            Toast.makeText(MainActivity.this, "you sent hey to everyone", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this, "you unhayed everyone", Toast.LENGTH_SHORT).show();
        }

        hey.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this, "you sent hey to everyone", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(MainActivity.this, "you unhayed everyone", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}