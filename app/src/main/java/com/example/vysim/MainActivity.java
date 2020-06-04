package com.example.vysim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   private Button button;
   private Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScreen9();
            }
        });

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScreen2();
            }
        });
    }
    public void openScreen9(){
        Intent intent2 = new Intent(this, screen9.class);
        startActivity(intent2);
    }

    public void openScreen2(){
        Intent intent = new Intent(this, screen2.class);
        startActivity(intent);
    }
}


