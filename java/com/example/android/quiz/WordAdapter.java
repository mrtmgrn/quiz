package com.example.android.quiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.quiz.R;
import com.example.android.quiz.Word;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Word} objects.
 */
public class WordAdapter extends ArrayAdapter<Word>  {

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     */
    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.pytania, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView jedenTextView = (TextView) listItemView.findViewById(R.id.jeden);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        jedenTextView.setText(currentWord.getPierwszaOdpowiedz());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView dwaTextView = (TextView) listItemView.findViewById(R.id.dwa);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        dwaTextView.setText(currentWord.getDrugaOdpowiedz());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView trzyTextView = (TextView) listItemView.findViewById(R.id.trzy);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        trzyTextView.setText(currentWord.getTrzeciaOdpowiedz());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView czteryTextView = (TextView) listItemView.findViewById(R.id.cztery);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        czteryTextView.setText(currentWord.getCzwartaOdpowiedz());


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}