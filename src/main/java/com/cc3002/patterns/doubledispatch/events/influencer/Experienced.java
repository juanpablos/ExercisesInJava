package com.cc3002.patterns.doubledispatch.events.influencer;

import com.cc3002.patterns.doubledispatch.events.media.AhoraGram;
import com.cc3002.patterns.doubledispatch.events.media.CaraBook;
import com.cc3002.patterns.doubledispatch.events.media.RojoDit;
import com.cc3002.patterns.doubledispatch.events.media.TuTube;

public class Experienced extends AbstractUser {
    public Experienced(String username) {
        super(username);
    }

    @Override
    public void publishOnAhoraGram(AhoraGram ahoraGram) {
        ahoraGram.publishStory();
        ahoraGram.publishPhoto();
        ahoraGram.publishVideo();
    }

    @Override
    public void publishOnCaraBook(CaraBook caraBook) {
        caraBook.publishRant();
    }

    @Override
    public void publishOnRojoDit(RojoDit rojoDit) {
        rojoDit.publishPost();
    }

    @Override
    public void publishOnTuTube(TuTube tuTube) {
        tuTube.publishVideo();
        tuTube.likeCatVideo();
    }
}
