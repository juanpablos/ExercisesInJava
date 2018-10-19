package com.cc3002.patterns.doubledispatch.events.media;

import com.cc3002.patterns.doubledispatch.events.influencer.User;

public class TuTube implements SocialMedia {
    @Override
    public void publishBy(User user) {
        user.publishOnTuTube(this);
    }

    public void publishDailyVlog() {
        // blabla
    }

    public void publishVideo() {
        // blabla
    }

    public void likeCatVideo() {
        // blabla
    }
}
