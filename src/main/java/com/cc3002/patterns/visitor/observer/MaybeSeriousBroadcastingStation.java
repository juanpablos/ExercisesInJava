package com.cc3002.patterns.visitor.observer;

import com.cc3002.patterns.visitor.observer.news.*;

import java.util.Observable;
import java.util.Observer;

public class MaybeSeriousBroadcastingStation implements Observer, NewsPublisher {

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof News) {
            ((News) arg).accept(this);
        }
    }

    @Override
    public void publishCelebrityNews(CelebrityStuff celebrityStuff) {
        System.out.println("Nobody cares...");
    }

    @Override
    public void publishBreakingNews(BreakingNews breakingNews) {
        System.out.println("BREAKING NEWS!!!");
        System.out.println("\t" + breakingNews.getInformation());
    }

    @Override
    public void publishFunCatVideos(FunCatVideos funCatVideos) {
        System.out.println("HAHA " + funCatVideos.getVideo());
    }
}
