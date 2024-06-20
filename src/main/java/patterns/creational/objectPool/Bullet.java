package patterns.creational.objectPool;

import patterns.creational.objectPool.interfaces.Poolable;

public class Bullet extends GameObject implements Poolable {
    @Override
    public void reset() {
        setPosition(new Point2D(0, 0));
        System.out.println("State was reset!");
    }
}
