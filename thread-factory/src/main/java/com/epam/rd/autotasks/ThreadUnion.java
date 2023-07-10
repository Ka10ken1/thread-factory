package com.epam.rd.autotasks;

import java.util.List;
import java.util.concurrent.ThreadFactory;

public interface ThreadUnion extends ThreadFactory {
    int totalSize();
    int activeSize();

    void shutdown();
    boolean isShutdown();
    void awaitTermination();
    boolean isFinished();

    List<FinishedThreadResult> results();

    static ThreadUnion newInstance(String name){
        //throw new UnsupportedOperationException();
        return new ThreadUnionImpl(name);
    }
}