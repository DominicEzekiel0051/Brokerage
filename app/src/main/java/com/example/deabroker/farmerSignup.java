package com.example.deabroker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.deabroker.ui.main.Buyer_Profile;

public class farmerSignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_signup);
    }

    public void openFarmerProfile(View view){

        Intent intent = new Intent(this.getApplicationContext(), Buyer_Profile.class);
        startActivity(intent);
    }
}
