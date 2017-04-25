package com.example.fianxeka.pratikum;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

import android.widget.TextView;
import android.widget.Toast;


public class Lab3Activity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    EditText e1, e2, e3;
    Button bt;
    Calendar calendar;
    DatePickerDialog datePickerDialog;
    int Year, Month, Day;
    Spinner s, kot;
    TextView dateView;

    String[] dept_array = {"CSE", "ECE", "IT", "Mech", "Civil"};
    String[] kota_array = {"Surabaya", "Jakarta", "Bangkalan", "Semarang", "Jogjakarta", "Lainnya"};
    String name, reg, dept, kota, hobi, dob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
        //datenow
        calendar = Calendar.getInstance();
        Year = calendar.get(Calendar.YEAR);
        Month = calendar.get(Calendar.MONTH);
        Day = calendar.get(Calendar.DAY_OF_MONTH);

        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);

        bt = (Button) findViewById(R.id.button);
        dateView = (TextView) findViewById(R.id.dateView);

        kot = (Spinner) findViewById(R.id.spinnerkota);
        s = (Spinner) findViewById(R.id.spinner);

    }

    public void submit(View view) {
        name = e1.getText().toString();
        reg = e2.getText().toString();
        dept = s.getSelectedItem().toString();
        kota = kot.getSelectedItem().toString();
        hobi = e3.getText().toString();
        dob = dateView.getText().toString();

        //Intent For Navigating to Second Activity
        Intent i = new Intent(Lab3Activity.this, Lab3Submit.class);

        i.putExtra("name_key", name);
        i.putExtra("reg_key", reg);
        i.putExtra("dept_key", dept);
        i.putExtra("kota_key", kota);
        i.putExtra("hobi_key", hobi);
        i.putExtra("dob_key", dob);
        startActivity(i);

    }

    public void setDate(View view) {
        datePickerDialog = DatePickerDialog.newInstance(Lab3Activity.this, Year, Month, Day);
        datePickerDialog.setThemeDark(false);
        datePickerDialog.setAccentColor(Color.parseColor("#009688"));
        datePickerDialog.setTitle("Pilih Tangga Lahir");
        datePickerDialog.show(getFragmentManager(), "DatePickerDialog");
    }

    @Override
    public void onDateSet(DatePickerDialog view, int Year, int Month, int Day) {
        String date = Day + "-" + Month + "-" + Year;
        dob = date;
        dateView.setText(dob);
    }


}
