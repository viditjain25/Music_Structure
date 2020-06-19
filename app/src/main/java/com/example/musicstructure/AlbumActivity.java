package com.example.musicstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        /** building album list
         * this is a temp list.
         * this list will be replaced with a dynamic
         * list from the system folder
         */

        ArrayList<Song> song= new ArrayList<Song>();
        song.add(new Song("Shayad","Arjit Singh"));
        song.add(new Song("Yeh Dooriyan","Arjit Singh"));
        song.add(new Song("Tera Zikr","Arjit Singh"));
        song.add(new Song("Pal","Arjit Singh"));
        song.add(new Song("Tu hi yaar mera","Arjit Singh"));
        song.add(new Song("Pachtaoge","Arjit Singh"));
        song.add(new Song("Yarriyan","Arjit Singh"));
        song.add(new Song("Janam Janam","Arjit Singh"));
        song.add(new Song("Kaise hua","Arjit Singh"));
        song.add(new Song("Bekhayali","Arjit Singh"));
        SongAdapter Adapter = new SongAdapter (this, song);

        ListView listView = (ListView) findViewById(R.id.listalbum);

        listView.setAdapter(Adapter);

      //  artist acitvity clickListener
        Button now =(Button) findViewById(R.id.gotonow);
        now.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(AlbumActivity.this, NowPlayingAcitvity.class);
                startActivity(artistsIntent);
            }
        });

        //albums acitvity clickListener
        Button artist =(Button) findViewById(R.id.gotoartist);
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(AlbumActivity.this, ArtistActivity.class);
                startActivity(albumIntent);
            }
        });


    }
}
