package com.cc3002.patterns.doubledispatch.socialmedia.influencer;

import com.cc3002.patterns.doubledispatch.socialmedia.media.*;

public interface User {
    void publish(SocialMedia socialMedia);
    void publishOnAhoraGram(AhoraGram ahoraGram);
    void publishOnCaraBook(CaraBook caraBook);
    void publishOnRIPGooglePlus(RIPGooglePlus ripGooglePlus);
    void publishOnRojoDit(RojoDit rojoDit);
    void publishOnTuTube(TuTube tuTube);

    String getUsername();

}
