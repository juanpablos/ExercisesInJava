package com.cc3002.threads.singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    // private static final ThreadSafeSingleton instance
    
    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
