package com.example.musicstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Context context, ArrayList<Song> pWords) {
        super(context, 0, (List<Song>) pWords);
    }
    @NonNull

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song local_word = getItem(position);
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(local_word.getSong());
        TextView artistsTextView = (TextView) listItemView.findViewById(R.id.artists_text_view);
        artistsTextView.setText(local_word.getArtists());

        return listItemView;
    }

}
