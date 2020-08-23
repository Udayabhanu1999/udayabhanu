package com.example.reg_316114214038;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    EditText rollnumber;
    EditText name;
    EditText collegename;
    EditText mail;
    EditText phoneno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollnumber= findViewById(R.id.rollno);
        name=findViewById(R.id.name);
        collegename=findViewById(R.id.college);
        mail=findViewById(R.id.mailid);
        phoneno=findViewById(R.id.phoneno);
    }

    public void movescreen(View view)
    {

        Intent i=new Intent(this,Displaydata.class);

    }



}