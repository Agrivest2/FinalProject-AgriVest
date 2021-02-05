package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayScreen extends AppCompatActivity {
    Button crop;
    Button good;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info);
        SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
        String display = preferences.getString("display", "");
        TextView displayInfo = (TextView) findViewById(R.id.textViewName);
        displayInfo.setText(display);

        crop = findViewById(R.id.btn2);
        crop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencropguide();
            }
        });
        good = findViewById(R.id.btn1);
        good.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengood();
            }
        });





    }

    public void opencropguide() {
        Intent intent = new Intent(this, cropguide.class);
        startActivity(intent);
    }
    public void opengood() {
        Intent intent = new Intent(this, goodpractices.class);
        startActivity(intent);
    }
}
