package com.example.fianxeka.pratikum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Lab2Edit extends AppCompatActivity {
    EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_edit);
        t = (EditText) findViewById(R.id.txtText);
    }

    public void changeNewText(View view){
        Lab2Activity.kata = t.getText().toString();
        finish();
    }
}
