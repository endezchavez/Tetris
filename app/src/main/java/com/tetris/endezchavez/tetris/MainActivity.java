package com.tetris.endezchavez.tetris;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Main menu buttons
        Button playButton;
        Button optionsButton;
        Button statisticsButton;
        Button leaderboardButton;
        Button exitButton;


        //Binding HomeScreen Buttons
        playButton = (Button)this.findViewById(R.id.play);
        optionsButton = (Button)this.findViewById(R.id.options);
        statisticsButton = (Button)this.findViewById(R.id.statistics);
        leaderboardButton = (Button)this.findViewById(R.id.leaderboards);
        exitButton = (Button)this.findViewById(R.id.exit);

        //Adding listenerns to buttons
        playButton.setOnClickListener(this);
        optionsButton.setOnClickListener(this);
        statisticsButton.setOnClickListener(this);
        leaderboardButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String buttonText;
        buttonText =((Button)v).getText().toString();
        if(buttonText.equals("PLAY")){
            Intent in;
            in  = new Intent(this, GameActivity.class);
            startActivity (in);
        }else if(buttonText.equals("OPTIONS")){
            Intent in;
            in  = new Intent(this, OptionsActivity.class);
            startActivity (in);
        }else if(buttonText.equals("STATISTICS")){
            Intent in;
            in  = new Intent(this, StatisticsActivity.class);
            startActivity (in);
        }else if(buttonText.equals("LEADERBOARDS")){
            Intent in;
            in  = new Intent(this, LeaderboardActivity.class);
            startActivity (in);
        }else if(buttonText.equals("EXIT")){
            finish();
            System.exit(0);
        }
    }
}
