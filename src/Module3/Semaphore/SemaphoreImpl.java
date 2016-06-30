package Module3.Semaphore;

/**
 * Created by Daniel Solo on 15.06.2016.
 */
public class SemaphoreImpl implements SemaphoreInt {

    private int maxPermits;
    private final Object lock = new Object();
    private volatile int permits;


    @Override
    public void acquire() throws InterruptedException {


    }

    @Override
    public void acquire(int permits) {

    }

    @Override
    public void release() {

    }

    @Override
    public void release(int permits) {

    }

    @Override
    public int getAvailablePermits() {
        return 0;
    }
}
