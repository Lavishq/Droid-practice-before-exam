package com.example.listviewcitis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner studentSpinner;
    private ListView citiesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
        studentSpinner = findViewById(R.id.studentSpinner);

//        ArrayList<String> students = new ArrayList<>();
//        students.add("Hellio");
//        students.add("navgidsf");
//        students.add("iogngnfd");
//
//        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_spinner_dropdown_item,
//                students
//        );

//        studentSpinner.setAdapter(studentsAdapter);

        studentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, studentSpinner.getItemAtPosition(i) + " Selected", Toast.LENGTH_SHORT).show();

                //werks without toString();
                Toast.makeText(MainActivity.this, studentSpinner.getSelectedItem().toString() + " Selected", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayList<String> citis = new ArrayList<>();
        citis.add("mumbai");
        citis.add("navi mumbai");
        citis.add("berlin");
        citis.add("new york");
        citis.add("vashi");
        citis.add("tokyo");
        citis.add("new mexico");
        citis.add("california");

        ArrayAdapter<String> citisAdapt = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                citis
        );

        citiesList.setAdapter(citisAdapt);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, citis.get(i) + " Selected", Toast.LENGTH_SHORT).show();
            }
        });

    }
}