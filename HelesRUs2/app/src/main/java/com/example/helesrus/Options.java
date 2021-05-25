package com.example.helesrus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class Options extends AppCompatActivity {
    private Button apartment,thouses,fhouses,houseg,mansion;
    private TextView price;
    int cost = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        apartment = findViewById(R.id.apartment);
        thouses = findViewById(R.id.thouse);
        fhouses = findViewById(R.id.fhouse);
        houseg = findViewById(R.id.houseg);
        mansion = findViewById(R.id.mansion);
        price = findViewById(R.id.price);

        apartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                price.setText("$3,000");
            }
        });

        thouses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                price.setText("$10,000");
            }
        });

        fhouses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                price.setText("$30,000");
            }
        });

        houseg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                price.setText("$50,000");
            }
        });

        mansion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                price.setText("$100,000");
            }
        });
    }


}