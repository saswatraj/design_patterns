package com.rajsaswa.designpatterns.singleton;

/**
 * Global class managing thread creation for the application.
 * It will limit operations to use 5 threads only.
 */
public class ThreadCreator
{
    private static final int THREAD_LIMIT = 5;
    private ThreadCreator instance;
    private int threadCount;

    private ThreadCreator()
    {
        threadCount = 0;
    }

    // instance method
    public ThreadCreator getInstance()
    {
        //deferred intialization
        if (instance == null) {
            instance = new ThreadCreator();
        }
        return instance;
    }

    public Thread createNewThread(Runnable runnable)
    {
        if (threadCount == THREAD_LIMIT) {
            throw new RuntimeException("Number of active threads cannot be more than " + THREAD_LIMIT);
        }
        threadCount++;
        Thread thread = new Thread(runnable);
        return thread;
    }

    //call when thread finishes execution
    public void finishedThreadExecution()
    {
        threadCount--;
    }
}
