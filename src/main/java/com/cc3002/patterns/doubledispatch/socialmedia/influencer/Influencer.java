package com.cc3002.patterns.doubledispatch.socialmedia.influencer;

import com.cc3002.patterns.doubledispatch.socialmedia.media.AhoraGram;
import com.cc3002.patterns.doubledispatch.socialmedia.media.CaraBook;
import com.cc3002.patterns.doubledispatch.socialmedia.media.TuTube;

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
