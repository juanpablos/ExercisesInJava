package com.cc3002.patterns.visitor.observer.news;

public class FunCatVideos implements News {
    private Video video;

    public FunCatVideos(Video video) {
        this.video = video;
    }

    @Override
    public void accept(NewsPublisher newsPublisher) {
        newsPublisher.publishFunCatVideos(this);
    }

    public Video getVideo() {
        return video;
    }
}
