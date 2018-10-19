package com.cc3002.patterns.doubledispatch.events.influencer;

import com.cc3002.patterns.doubledispatch.events.media.AhoraGram;
import com.cc3002.patterns.doubledispatch.events.media.CaraBook;
import com.cc3002.patterns.doubledispatch.events.media.TuTube;

public class Influencer extends AbstractUser {
    public Influencer(String username) {
        super(username);
    }

    @Override
    public void publishOnAhoraGram(AhoraGram ahoraGram) {
        ahoraGram.publishPhoto();
        ahoraGram.publishStory();
    }

    @Override
    public void publishOnCaraBook(CaraBook caraBook) {
        caraBook.publishLifeEvent();
        caraBook.marketing();
    }

    @Override
    public void publishOnTuTube(TuTube tuTube) {
        tuTube.publishDailyVlog();
        tuTube.publishVideo();
    }
}
