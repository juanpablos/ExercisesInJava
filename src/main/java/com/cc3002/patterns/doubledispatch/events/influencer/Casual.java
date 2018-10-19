package com.cc3002.patterns.doubledispatch.events.influencer;

import com.cc3002.patterns.doubledispatch.events.media.AhoraGram;
import com.cc3002.patterns.doubledispatch.events.media.CaraBook;
import com.cc3002.patterns.doubledispatch.events.media.TuTube;

public class Casual extends AbstractUser {
    public Casual(String username) {
        super(username);
    }

    @Override
    public void publishOnAhoraGram(AhoraGram ahoraGram) {
        ahoraGram.publishPhoto();
    }

    @Override
    public void publishOnCaraBook(CaraBook caraBook) {
        caraBook.publishLifeEvent();
    }

    @Override
    public void publishOnTuTube(TuTube tuTube) {
        tuTube.likeCatVideo();
    }
}
