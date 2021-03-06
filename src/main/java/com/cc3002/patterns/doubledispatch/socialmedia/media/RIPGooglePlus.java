package com.cc3002.patterns.doubledispatch.socialmedia.media;

import com.cc3002.patterns.doubledispatch.socialmedia.influencer.User;

public class RIPGooglePlus implements SocialMedia {
    @Override
    public void publishBy(User user) {
        user.publishOnRIPGooglePlus(this);
    }

    public void rip() {
        // rip
    }
}
