package com.example.deabroker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
    }

    public void openLogin(View view){
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }

    public void openRegister(View view){
        Intent intents = new Intent(this, farmerSignup.class);
        startActivity(intents);
    }

    public void openAboutUs(View view){
        Intent intentA = new Intent(this,AboutUs.class);
        startActivity(intentA);
    }
}
