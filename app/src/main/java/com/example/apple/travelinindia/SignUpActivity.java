package com.example.apple.travelinindia;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SignUpActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // for testing of register button
        button = findViewById(R.id.register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(SignUpActivity.this,Travel.class);
                startActivity(intent);
            }
        });


    }

}
