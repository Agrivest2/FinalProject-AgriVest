package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class goodpractices extends AppCompatActivity {
    Button good1;
    Button good2;
    Button good3;
    Button good4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodpractices);

        good1 = findViewById(R.id.g1);
        good1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openg1();
            }
        });
        good2 = findViewById(R.id.good2);
        good2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openg2();
            }
        });
        good3 = findViewById(R.id.good3);
        good3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openg3();
            }
        });
        good4 = findViewById(R.id.good4);
        good4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openg4();
            }
        });


    }
    public void openg1() {
        Intent intent = new Intent(this, soil.class);
        startActivity(intent);
    }
    public void openg2() {
        Intent intent = new Intent(this, good2.class);
        startActivity(intent);
    }
    public void openg3() {
        Intent intent = new Intent(this, good3.class);
        startActivity(intent);
    }
    public void openg4() {
        Intent intent = new Intent(this, good4.class);
        startActivity(intent);
    }
}