package com.example.reg_316114214038;


import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class activity_secondscreen extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondscreen);

        textView=findViewById(R.id.rollno);
        textView=findViewById(R.id.name);
        textView=findViewById(R.id.college);
        textView=findViewById(R.id.mailid);
        textView=findViewById(R.id.phoneno);

        String res= getIntent().getStringExtra("bhanu");
        textView.setText(res);

    }
}