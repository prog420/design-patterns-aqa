package patterns.structural.bridge.v1;

/**
 * This is the implementor.
 * Note that this is also an interface
 * As implementor it's defining its own hierarchy which not related to the abstraction hierarchy.
 */
public interface LinkedList<T> {
    void addFirst(T element);
    T removeFirst();
    void addLast(T element);
    T removeLast();
    int getSize();
}
