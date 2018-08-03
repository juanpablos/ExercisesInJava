package com.cc3002.patterns.factory.codecs;

import com.cc3002.patterns.factory.music.Song;

public class FlacDecoder implements Codec {
    private Song song;

    public FlacDecoder(Song song) {
        this.song = song;
    }

    @Override
    public DecodedSong getDecodedSong() {
        return new DecodedSong(song.getName());
    }

    @Override
    public String toString() {
        return "FlacDecoder{" +
                "song=" + song +
                '}';
    }
}
