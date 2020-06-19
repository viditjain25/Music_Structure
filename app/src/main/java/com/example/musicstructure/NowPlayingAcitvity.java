package com.example.musicstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NowPlayingAcitvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing_acitvity);

        //artist acitvity clickListener
        Button artist =(Button) findViewById(R.id.gotoartist);
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(NowPlayingAcitvity.this, ArtistActivity.class);
                startActivity(artistsIntent);
            }
        });

        //albums acitvity clickListener
        Button albums =(Button) findViewById(R.id.switchalbum);
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(NowPlayingAcitvity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

    }
}
