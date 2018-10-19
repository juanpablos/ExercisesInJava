package com.cc3002.patterns.doubledispatch.socialmedia.influencer;

import com.cc3002.patterns.doubledispatch.socialmedia.media.AhoraGram;
import com.cc3002.patterns.doubledispatch.socialmedia.media.CaraBook;
import com.cc3002.patterns.doubledispatch.socialmedia.media.RojoDit;
import com.cc3002.patterns.doubledispatch.socialmedia.media.TuTube;

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
