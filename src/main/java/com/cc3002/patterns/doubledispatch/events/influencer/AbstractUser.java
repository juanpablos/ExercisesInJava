package com.cc3002.patterns.doubledispatch.events.influencer;

import com.cc3002.patterns.doubledispatch.events.media.*;

public abstract class AbstractUser implements User {
    private String username;

    public AbstractUser(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void publish(SocialMedia socialMedia) {
        socialMedia.publishBy(this);
    }

    @Override
    public abstract void publishOnAhoraGram(AhoraGram ahoraGram);

    @Override
    public abstract void publishOnCaraBook(CaraBook caraBook);

    @Override
    public void publishOnRIPGooglePlus(RIPGooglePlus ripGooglePlus) {
        // do nothing
    }

    @Override
    public abstract void publishOnRojoDit(RojoDit rojoDit);

    @Override
    public abstract void publishOnTuTube(TuTube tuTube);

}
