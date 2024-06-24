package patterns.creational.objectPool.v1;

import patterns.creational.objectPool.v1.interfaces.Poolable;

public class Bullet extends GameObject implements Poolable {
    @Override
    public void reset() {
        setPosition(new Point2D(0, 0));
        System.out.println("State was reset!");
    }
}
