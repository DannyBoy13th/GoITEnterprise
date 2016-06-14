package Semaphore;

/**
 * Created by Daniel Solo on 15.06.2016.
 */
public interface SemaphoreInt {

    public void acquire();

    public void acquire(int permits);

    public void release();

    public void release(int permits);

    public int getAvailablePermits();
}
