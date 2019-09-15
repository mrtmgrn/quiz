package com.example.android.quiz;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView przeskok = (TextView) findViewById(R.id.przeskok);

        // Set a click listener on that View
        przeskok.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent przeskokIntent = new Intent(MainActivity.this, QActivity.class);

                // Start the new activity
                startActivity(przeskokIntent);
            }
        });
    }

//
//        if (ravenclawClicked) {
//            Toast.makeText(this, "Wygrałaś!", Toast.LENGTH_SHORT).show();
//        }
//        if (gryffindorClicked) {
//            Toast.makeText(this, "Przegrałaś!", Toast.LENGTH_SHORT).show();
//        }
//        if (hufflepuffClicked) {
//            Toast.makeText(this, "Przegrałaś!", Toast.LENGTH_SHORT).show();
//        }
//        if (slytherinClicked)
//            Toast.makeText(this, "Przegrałaś!", Toast.LENGTH_SHORT).show();

    }
//
//




