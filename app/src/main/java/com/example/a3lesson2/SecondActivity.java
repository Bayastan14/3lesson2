package com.example.a3lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.second_container, new AddFragment())
                .commit();

      
    }

}