package com.mkirilly.btmastermind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the "start game" button, starts a game */
    public void startGameClicked(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);

    }

}