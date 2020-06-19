package com.example.musicstructure;

public class Song {

    /** Song name */
    private String mSongs;

    /** Artist  for the song*/
    private String mArtists;

    /**
     * Create a new song object.
     *
     * @param songs is the name of the song
     * @param artists is the name of the artist
     */
    public Song(String songs, String artists) {
        mSongs = songs;
        mArtists = artists;
    }

    /**
     * Get the Song name.
     */
    public String getSong() {
        return mSongs;
    }

    /**
     * Get the Artists name of the song
     */
    public String getArtists() {
        return mArtists;
    }
}
