package com.example.fianxeka.pratikum;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Lab2Activity extends AppCompatActivity {
    public static String kata = "Hello World";
    TextView t;
    int ch = 1;
    float font = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);
        t = (TextView) findViewById(R.id.textviewku);
        t.setText(kata);
    }

    public void changeText(View view){
        Intent intent = new Intent(this,Lab2Edit.class);
        startActivity(intent);
    }

    public void changeSize(View view) {
        t.setTextSize(font);
        font += 5;
        if (font == 50) {
            font = 30;
        }
    }

    public void changeColor(View view) {
        switch (ch) {
            case 1:
                t.setTextColor(Color.RED);
                break;
            case 2:
                t.setTextColor(Color.GREEN);
                break;
            case 3:
                t.setTextColor(Color.BLUE);
                break;
            case 4:
                t.setTextColor(Color.CYAN);
                break;
            case 5:
                t.setTextColor(Color.YELLOW);
                break;
            case 6:
                t.setTextColor(Color.MAGENTA);
                break;
        }
        ch++;
        if (ch==7){
            t.setTextColor(Color.BLACK);
            ch=1;
        }
    }

    @Override
    public void onResume(){
        super.onResume();
        t.setText(kata);

    }
}
