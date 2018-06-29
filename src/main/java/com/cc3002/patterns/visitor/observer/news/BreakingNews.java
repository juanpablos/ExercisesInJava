package com.cc3002.patterns.visitor.observer.news;

public class BreakingNews implements News {
    private String information;

    public BreakingNews(String information) {
        this.information = information;
    }

    @Override
    public void accept(NewsPublisher newsPublisher) {
        newsPublisher.publishBreakingNews(this);
    }

    public String getInformation() {
        return information;
    }
}
