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

        // Find the TextView in the list_item.xml layout with the ID of text_view.
        TextView pytanieTextView = (TextView) listItemView.findViewById(R.id.pytanie);
        pytanieTextView.setText(currentWord.getPytanie());

        TextView jedenTextView = (TextView) listItemView.findViewById(R.id.jeden);
        jedenTextView.setText(currentWord.getPierwszaOdpowiedz());

        TextView dwaTextView = (TextView) listItemView.findViewById(R.id.dwa);
        dwaTextView.setText(currentWord.getDrugaOdpowiedz());


        TextView trzyTextView = (TextView) listItemView.findViewById(R.id.trzy);
        trzyTextView.setText(currentWord.getTrzeciaOdpowiedz());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView czteryTextView = (TextView) listItemView.findViewById(R.id.cztery);
        czteryTextView.setText(currentWord.getCzwartaOdpowiedz());


        // Return the whole list item layout (containing TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}