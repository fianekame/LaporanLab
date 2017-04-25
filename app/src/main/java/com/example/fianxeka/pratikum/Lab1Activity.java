package com.example.fianxeka.pratikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Lab1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
    }

    public void showGreeting(View view){
        Intent intent = new Intent(this,Lab1Greeting.class);
        startActivity(intent);
    }

}
