package com.example.reg_316114214038;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Displaydata extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondscreen);

        textView=findViewById(R.id.tv);

        String res= getIntent().getStringExtra("bhanu");
        textView.setText(res);

    }

}
