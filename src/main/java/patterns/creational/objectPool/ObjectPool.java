package patterns.creational.objectPool;

import patterns.creational.objectPool.interfaces.Poolable;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ObjectPool<T extends Poolable> {
    private BlockingQueue<T> availablePool;

    public ObjectPool() {
        availablePool = new LinkedBlockingQueue<>();
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException ex) {
            System.err.println("take() was interrupted");
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException ex) {
            System.err.println("release() was interrupted");
        }
    }
}
