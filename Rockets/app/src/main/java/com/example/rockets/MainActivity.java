package com.example.rockets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonTeam;
    private Button buttonContactUS;
    private Button buttonPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTeam = (Button) findViewById(R.id.button6);
        buttonTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTeam();
            }
        });

        buttonContactUS = (Button) findViewById(R.id.button9);
        buttonContactUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rocketsnationfrance.com/"));
                startActivity(browserIntent);
            }
        });

        buttonPlayers = (Button) findViewById(R.id.button7);
        buttonPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayers();
            }
        });
    };
    public void openTeam(){
        Intent intent = new Intent(this, MainTeam.class);
        startActivity(intent);
    }
    public void openPlayers(){
        Intent intent = new Intent(this, Players.class);
        startActivity(intent);
    }



}