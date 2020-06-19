package com.example.musicstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //artist acitvity clickListener
        TextView artist =(TextView) findViewById(R.id.artist);
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistsIntent);
            }
        });

        //albums acitvity clickListener
        TextView albums =(TextView) findViewById(R.id.album);
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        //Now Playing acitvity clickListener
        TextView now =(TextView) findViewById(R.id.now);
        now.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(MainActivity.this, NowPlayingAcitvity.class);
                startActivity(nowIntent);
            }
        });

    }
}
