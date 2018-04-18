package com.example.ammonriley.catcharide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*MENUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.exit_program:
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    /*END MENU*/

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
