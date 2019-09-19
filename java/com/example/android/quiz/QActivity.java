package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class QActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_list);

        // Creates a QandA
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("1. W jakim domu jest Luna Lovegood?", "Gryffindor", "Hufflepuff", "Slytherin", "Ravenclaw"));
        words.add(new Word("2. Jak nazywał się ojciec Harry'ego?", "Todd", "Andrew", "James", "Finn"));
        words.add(new Word("3. Jakiego zwierzaka miała Hermiona?", "Kota", "Ropuchę", "Szczura", "Sowę"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }

    int number = 0;


//    Instruction to what happens when a radio button is clicked

    public void onRadioButtonClicked(View view) {
        RadioButton gryffindorCheckBox = (RadioButton) findViewById(R.id.jeden);
        boolean gryffindorClicked = gryffindorCheckBox.isChecked();

        RadioButton hufflepuffCheckBox = (RadioButton) findViewById(R.id.dwa);
        boolean hufflepuffClicked = hufflepuffCheckBox.isChecked();

        RadioButton slytherinCheckBox = (RadioButton) findViewById(R.id.trzy);
        boolean slytherinClicked = slytherinCheckBox.isChecked();

        RadioButton ravenclawCheckBox = (RadioButton) findViewById(R.id.cztery);
        boolean ravenclawClicked = ravenclawCheckBox.isChecked();

        if (ravenclawClicked && number < 1) {

            number = number + 1;
            displayQuantity(number);
        } else if (hufflepuffClicked) {
            displayQuantity(number);
        } else if (slytherinClicked) {
            displayQuantity(number);
        } else if (slytherinClicked) {
            displayQuantity(number);
        }
    }
//      Sums up the points
    private void displayQuantity(int punkty) {
        TextView quantityTextView = (TextView) findViewById(R.id.punkty);
        quantityTextView.setText("Punkty: " + punkty);
    }
}