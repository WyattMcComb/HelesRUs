package com.example.helesrus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView contact = (TextView) findViewById(R.id.contact);

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, Contact.class);
                startActivity(contactIntent);
            }

        });

        TextView info = (TextView) findViewById(R.id.info);

        info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View view){
                Intent infoIntent = new Intent(MainActivity.this, MoreInfo.class);
                startActivity(infoIntent);
                }
        });

        TextView options = (TextView) findViewById(R.id.options);

        options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent optionsIntent = new Intent(MainActivity.this, Options.class);
                startActivity(optionsIntent);
            }
        });
    }
}