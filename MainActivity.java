package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t,t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(EditText) findViewById(R.id.ed1) ;
        t1=(EditText) findViewById(R.id.ed2);

    }

    public void show(View view) {
       String name= t.getText().toString();
       String password = t1.getText().toString();
        Toast.makeText(this,"wlecome to "+name,Toast.LENGTH_LONG).show();
    }

}
