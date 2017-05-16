package com.example.fianxeka.pratikum;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Lab5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5);
    }

    public void onButtonClick(View v)
    {
        Lab5FragmentTwo fragmentTwo = (Lab5FragmentTwo) getFragmentManager().findFragmentById(R.id.fragment_two);
        switch(v.getId()) {
            case R.id.btn_one_create_new:
                if (fragmentTwo == null) {
                    // Need to launch another activity
                    Intent i = new Intent(this, Lab5Drawing.class);
                    startActivity(i);
                }
                else{
                    // Do nothing right now, and just show up a toast.
                    Toast.makeText(this, "Will be implemented later", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_one_open_existing:
                Toast.makeText(this, "Will be implemented later", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
    }
}
