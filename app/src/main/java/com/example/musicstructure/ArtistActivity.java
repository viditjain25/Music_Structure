package com.example.musicstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /** building album list
         * this is a temp list.
         * this list will be replaced with a dynamic
         * list from the system folder
         */

        ArrayList<Song> song= new ArrayList<Song>();
        song.add(new Song("Zombie","Stars"));
        song.add(new Song("Stuck With You","Ariana Grande, Justin Bieber"));
        song.add(new Song("Toosie Silde","Drake"));
        song.add(new Song("Rockstar","DaBaby"));
        song.add(new Song("Darkside","Alan Walker"));
        song.add(new Song("Blinding Lights","The Weekend"));
        song.add(new Song("Yummy","Justin Bieber"));
        song.add(new Song("Skechers","DripReport"));
        song.add(new Song("Say So","Doja Cat"));
        song.add(new Song("Life is Good","Future"));
        song.add(new Song("Starboy","The Weekend"));
        song.add(new Song("Hymn for the weekend","Coldplay"));
        song.add(new Song("Scientist","Coldplay"));
        song.add(new Song("Feel Me","Selena Gomez"));
        song.add(new Song("7 rings","Ariana Grande"));
        song.add(new Song("7 years","Lukas Gharam"));
        song.add(new Song("Takeaway","Chainsmokers"));
        song.add(new Song("Faded","Alan Walker"));
        SongAdapter Adapter = new SongAdapter (this, song);

        ListView listView = (ListView) findViewById(R.id.listartist);

        listView.setAdapter(Adapter);

        //artist acitvity clickListener
        Button artist =(Button) findViewById(R.id.gotonow);
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(ArtistActivity.this, NowPlayingAcitvity.class);
                startActivity(artistsIntent);
            }
        });

        //albums acitvity clickListener
        Button albums =(Button) findViewById(R.id.switchalbum);
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(ArtistActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

    }
}
