package com.example.sp_intent;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      EditText user;
      EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         user =(EditText) findViewById(R.id.u1);
         pass=(EditText) findViewById(R.id.p1);
    }


    public void Save(View view)
    {
        String u1=user.getText().toString();
        String p1=pass.getText().toString();
        if(u1.equals("")||p1.equals(""))
        {
            String user="DEFAULT";
            String pass="DEFAULT";
        }
        else {
            SharedPreferences sp = getSharedPreferences("mydata", Context.MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putString("name", user.getText().toString());
            ed.putString("pass", pass.getText().toString());
            ed.commit();
            Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
        }

    }

    public void Next(View view)
    {
        Toast.makeText(this, "NEXT PAGE", Toast.LENGTH_SHORT).show();
        Intent in =new Intent(this, MainActivity2.class);
        startActivity(in);
    }

}
