package com.example.fianxeka.pratikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnclick(View view){
        Intent intent =  new Intent(this,Lab1Activity.class);
        switch(view.getId())
        {
            case R.id.lab1:
                intent = new Intent(this,Lab1Activity.class);
                break;

            case R.id.lab2:
                intent = new Intent(this,Lab2Activity.class);
                break;

            case R.id.lab3:
                intent = new Intent(this,Lab3Activity.class);
                break;

            case R.id.lab4:
                intent = new Intent(this,Lab4Activity.class);
                break;
        }
        startActivity(intent);

    }
}
