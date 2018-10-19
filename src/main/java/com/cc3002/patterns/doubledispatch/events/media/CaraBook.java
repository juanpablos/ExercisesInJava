package com.cc3002.patterns.doubledispatch.events.media;

import com.cc3002.patterns.doubledispatch.events.influencer.User;

public class CaraBook implements SocialMedia {
    @Override
    public void publishBy(User user) {
        user.publishOnCaraBook(this);
    }

    public void publishRant() {
        // blabla
    }

    public void marketing() {
        // blabla
    }

    public void publishLifeEvent() {
        // blabla
    }
}
