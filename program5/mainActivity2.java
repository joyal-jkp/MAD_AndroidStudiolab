package com.example.sp_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
  EditText userB;
  EditText passB;
  String DEFAULT="DEFAULT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        userB=(EditText) findViewById(R.id.u2);
        passB=(EditText) findViewById(R.id.p2);
    }
    public void Load(View view)
    {
        SharedPreferences sp=getSharedPreferences("mydata", Context.MODE_PRIVATE);
        String user=sp.getString("name","DEFAULT");
        String pass=sp.getString("pass","DEFAULT");
        if(user.equals(DEFAULT)||(pass.equals(DEFAULT)))
        {
            Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show();
        }
        else
        {
            userB.setText(user);
            passB.setText(pass);
            Toast.makeText(this, "Loaded", Toast.LENGTH_SHORT).show();
        }
    }

    public void Prev(View view)
    {
        Toast.makeText(this, "PREV PAGE", Toast.LENGTH_SHORT).show();
        Intent in =new Intent(this, MainActivity.class);
        startActivity(in);
    }

}
