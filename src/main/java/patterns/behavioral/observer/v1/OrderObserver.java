package patterns.behavioral.observer.v1;

/**
 * Abstract observer
 */
public interface OrderObserver {
    void updated(Order order);
}
