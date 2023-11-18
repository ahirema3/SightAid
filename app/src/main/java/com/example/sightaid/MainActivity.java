package com.example.sightaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when the Object Detection button is clicked
    public void onObjectDetectionClick(View view) {
        Intent intent = new Intent(this, odmActivity.class);
        startActivity(intent);
    }

    // Called when the Braille Keyboard button is clicked
    public void onBrailleKeyboardClick(View view) {
        Intent intent = new Intent(this, KeyboardActivity.class);
        startActivity(intent);
    }
}
