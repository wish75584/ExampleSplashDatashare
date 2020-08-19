package com.stubborn.examplesplashdatashare;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView txtid, txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen


        setContentView(R.layout.activity_second);

        txtid = findViewById(R.id.txtid);
        txtpass = findViewById(R.id.txtpass);

        Intent intent = getIntent();
        String ID = intent.getStringExtra("id");
        String PASS = intent.getStringExtra("pass");

        txtid.setText(ID);
        txtpass.setText(PASS);

        Toast.makeText(SecondActivity.this, "Second Activity", Toast.LENGTH_LONG);

    }
}
