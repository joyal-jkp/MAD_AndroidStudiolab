package com.example.linearlay;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText fname,lname,date,email,phone,pass;
    Button b;
    private Spinner spinner;
    ArrayAdapter<String> arrayAdapter;
    String[] degree={"---select---","BSC","MCA","BCA","Bcom","BBA"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.reg);
        fname = findViewById(R.id.fn);
        lname = findViewById(R.id.ln);
        date = findViewById(R.id.date);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        pass = findViewById(R.id.pass);

        spinner=findViewById(R.id.sp);
        arrayAdapter =new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line,degree);
        spinner.setAdapter(arrayAdapter);
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "you select"+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fname.length()==0){
                    Toast.makeText(MainActivity.this, "enter first name", Toast.LENGTH_SHORT).show();
                }
                else if(lname.length()==0){
                    Toast.makeText(MainActivity.this, "enter last name", Toast.LENGTH_SHORT).show();
                }
                else if(date.length()==0){
                    Toast.makeText(MainActivity.this, "enter dob", Toast.LENGTH_SHORT).show();
                }
                else if(email.length()==0){
                    Toast.makeText(MainActivity.this, "enter email", Toast.LENGTH_SHORT).show();
                }
                else if(phone.length()==0){
                    Toast.makeText(MainActivity.this, "enter phone number", Toast.LENGTH_SHORT).show();
                }
                else if(pass.length()==0){
                    Toast.makeText(MainActivity.this, "enter the password", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "registered successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}