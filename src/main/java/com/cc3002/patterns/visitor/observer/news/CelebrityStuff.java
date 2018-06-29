package com.cc3002.patterns.visitor.observer.news;

public class CelebrityStuff implements News {
    private String scoop;

    public CelebrityStuff(String scoop) {
        this.scoop = scoop;
    }

    @Override
    public void accept(NewsPublisher newsPublisher) {
        newsPublisher.publishCelebrityNews(this);
    }

    public String getScoop() {
        return scoop;
    }
}
