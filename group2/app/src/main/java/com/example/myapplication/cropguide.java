package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cropguide extends AppCompatActivity {

    Button tool1;
    Button tool2;
    Button tool3;
    Button tool4;
    Button tool5;
    Button tool6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cropguide);

        tool1 = findViewById(R.id.tool1);
        tool1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opent1();
            }
        });

        tool2 = findViewById(R.id.tool2);
        tool2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opent2();
            }
        });
        tool3 = findViewById(R.id.tool3);
        tool3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opent3();
            }
        });

        tool4 = findViewById(R.id.tool4);
        tool4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opent4();
            }
        });
        tool5 = findViewById(R.id.tool5);
        tool5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opent5();
            }
        });

        tool6 = findViewById(R.id.tool6);
        tool6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opent6();
            }
        });




    }

    public void opent1() {
        Intent intent = new Intent(this, tool1.class);
        startActivity(intent);
    }
    public void opent2() {
        Intent intent = new Intent(this, tool2.class);
        startActivity(intent);
    }
    public void opent3() {
        Intent intent = new Intent(this, tool3.class);
        startActivity(intent);
    }
    public void opent4() {
        Intent intent = new Intent(this, tool4.class);
        startActivity(intent);
    }
    public void opent5() {
        Intent intent = new Intent(this, tool5.class);
        startActivity(intent);
    }
    public void opent6() {
        Intent intent = new Intent(this, tool6.class);
        startActivity(intent);
    }
}
