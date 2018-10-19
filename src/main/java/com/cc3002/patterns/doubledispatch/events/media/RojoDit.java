package com.cc3002.patterns.doubledispatch.events.media;

import com.cc3002.patterns.doubledispatch.events.influencer.User;

public class RojoDit implements SocialMedia {
    @Override
    public void publishBy(User user) {
        user.publishOnRojoDit(this);
    }

    public void publishPost() {
        // blabla
    }

}
