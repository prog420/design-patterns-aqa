package patterns.creational.objectPool.v1.interfaces;


/** Any class which implements this interface can be pooled in out object pool */
public interface Poolable {
    /** State reset */
    void reset();
}
