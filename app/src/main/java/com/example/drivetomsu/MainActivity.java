package com.example.drivetomsu;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button drivebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drivebtn = findViewById(R.id.driveBtn);
        drivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToMsu();
            }
        });

    }


    public void GoToMsu() {

        //Navigates straight to MSU
        //Uri gmmIntentUri = Uri.parse("google.navigation:q=1+Normal+Ave,+Montclair,NJ(MSU)"); //start navigating to MSU
        //Show Route to MSU
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&destination=1+Normal+Ave,+Montclair,NJ");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");

        try {
                startActivity(mapIntent); //start intent and if it fails, show toast
            } catch (Exception exception) {
            Toast.makeText(this, "Couldn't open map", Toast.LENGTH_SHORT).show();
        }


    }
}