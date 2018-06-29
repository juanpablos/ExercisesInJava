package com.cc3002.patterns.visitor.observer;

import com.cc3002.patterns.visitor.observer.news.BreakingNews;
import com.cc3002.patterns.visitor.observer.news.CelebrityStuff;
import com.cc3002.patterns.visitor.observer.news.FunCatVideos;
import com.cc3002.patterns.visitor.observer.news.Video;

import java.util.Observable;
import java.util.Observer;

public class NewsGenerator extends Observable {
    public void subscribe(Observer station) {
        addObserver(station);
    }

    public void newCatVideo(Video video) {
        setChanged();
        notifyObservers(new FunCatVideos(video));
    }

    public void newWhatever() {
        setChanged();
        notifyObservers(new CelebrityStuff("THEY KISSED!!!!!!"));
    }

    public void newActualNews(String information) {
        setChanged();
        notifyObservers(new BreakingNews(information));
    }

}
