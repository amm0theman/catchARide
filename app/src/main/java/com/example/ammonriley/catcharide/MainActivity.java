package com.example.ammonriley.catcharide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*If the user presses Catch-A-Ride*/
    public void catchARide(View view) {
        Intent intent = new Intent(this, CatchARide.class);
        startActivity(intent);
    }

    /*If the user presses Provide-A-Ride*/
    public void provideARide(View view) {
        Intent intent = new Intent(this, ProvideARide.class);
        startActivity(intent);
    }

}
