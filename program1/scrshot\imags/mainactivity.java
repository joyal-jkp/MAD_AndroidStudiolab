package com.example.simplecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText first, second;
    private Button bt, bt2, bt3, bt4;
    private TextView result;
    int n1, n2, n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        bt = (Button) findViewById(R.id.bt);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        result = (TextView) findViewById(R.id.result);
        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                n1 = Integer.parseInt(first.getText().toString());
                n2 = Integer.parseInt(second.getText().toString());
                n3 = n1 + n2;
                result.setText(String.valueOf(n3));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                n1 = Integer.parseInt(first.getText().toString());
                n2 = Integer.parseInt(second.getText().toString());
                n3 = n1 - n2;
                result.setText(String.valueOf(n3));
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                n1 = Integer.parseInt(first.getText().toString());
                n2 = Integer.parseInt(second.getText().toString());
                n3 = n1 / n2;
                result.setText(String.valueOf(n3));
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                n1 = Integer.parseInt(first.getText().toString());
                n2 = Integer.parseInt(second.getText().toString());
                n3 = n1 * n2;
                result.setText(String.valueOf(n3));
            }
        });
    }
}
