package com.cc3002.patterns.visitor.observer.news;

public interface NewsPublisher {
    void publishCelebrityNews(CelebrityStuff celebrityStuff);

    void publishBreakingNews(BreakingNews breakingNews);

    void publishFunCatVideos(FunCatVideos funCatVideos);
}
