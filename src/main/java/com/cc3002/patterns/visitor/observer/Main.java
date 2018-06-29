package com.cc3002.patterns.visitor.observer;

import com.cc3002.patterns.visitor.observer.news.Video;

public class Main {
    public static void main(String[] args) {
        MaybeSeriousBroadcastingStation station = new MaybeSeriousBroadcastingStation();
        NewsGenerator news = new NewsGenerator();
        news.subscribe(station);

        news.newActualNews("/AAAAAAAAAAAAA EVERYONE RUN!!!");

        news.newCatVideo(new Video("LOL this is g8"));

        news.newWhatever();

    }
}
