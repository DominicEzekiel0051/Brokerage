package com.example.deabroker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.deabroker.ui.main.Buyer_Profile;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

      //  view = View.inflate(getApplicationContext(),R.layout.activity_login, null);
    }

    public void openBuyerProfile(View view){

        Intent intent = new Intent(this.getApplicationContext(), Farmer_Profile.class);
        startActivity(intent);
    }

}
