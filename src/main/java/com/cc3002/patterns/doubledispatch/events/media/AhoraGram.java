package com.cc3002.patterns.doubledispatch.events.media;

import com.cc3002.patterns.doubledispatch.events.influencer.User;

public class AhoraGram implements SocialMedia {
    @Override
    public void publishBy(User user) {
        user.publishOnAhoraGram(this);
    }

    public void publishStory() {
        // blabla
    }

    public void publishVideo() {
        // blabla
    }

    public void publishPhoto() {
        // blabla
    }
}
