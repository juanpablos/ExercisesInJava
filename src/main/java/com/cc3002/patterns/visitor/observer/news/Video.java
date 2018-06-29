package com.cc3002.patterns.visitor.observer.news;

public class Video {
    private String videoName;

    public Video(String videoName) {
        this.videoName = videoName;
    }

    @Override
    public String toString() {
        return videoName;
    }
}
