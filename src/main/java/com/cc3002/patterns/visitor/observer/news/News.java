package com.cc3002.patterns.visitor.observer.news;

public interface News {
    void accept(NewsPublisher newsPublisher);
}
