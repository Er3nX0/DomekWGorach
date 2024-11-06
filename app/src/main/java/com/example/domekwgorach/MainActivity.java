package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView TextViewPolubienia;
    private Button buttonPolub;
    private Button buttonUsun;
    private int polubienia = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextViewPolubienia = findViewById(R.id.polubienia);
        buttonPolub = findViewById(R.id.polub);
        buttonUsun = findViewById(R.id.usun);

        buttonPolub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    polubienia++;
                    TextViewPolubienia.setText(polubienia + " polubień");
            }
        });
        buttonUsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (polubienia>0){
                    polubienia--;
                    TextViewPolubienia.setText(polubienia + " polubień");
                }
            }
        });
    }
}