package com.example.deabroker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button = (Button)findViewById(R.id.proceedButton);
        
      //  toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setSupportActionBar(Toolbar toolbar) {

    }

    public void openIntroduction(View view){
        Intent intent = new Intent(this,introduction.class);
        startActivity(intent);
    }

}
