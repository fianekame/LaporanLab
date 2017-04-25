package com.example.fianxeka.pratikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Lab3Submit extends AppCompatActivity {

    TextView t1, t2, t3, t4, t5, t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_submit);
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
        t5 = (TextView) findViewById(R.id.textView5);
        t6 = (TextView) findViewById(R.id.textView6);
        //Getting the Intent
        Intent i = getIntent();

        //Setting the Values to Intent
        t1.setText(i.getStringExtra("name_key"));
        t2.setText(i.getStringExtra("reg_key"));
        t3.setText(i.getStringExtra("dept_key"));
        t4.setText(i.getStringExtra("kota_key"));
        t5.setText(i.getStringExtra("hobi_key"));
        t6.setText(i.getStringExtra("dob_key"));
    }
}
