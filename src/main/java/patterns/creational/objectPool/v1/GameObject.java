package patterns.creational.objectPool.v1;

import patterns.creational.objectPool.v1.interfaces.Poolable;

public abstract class GameObject implements Poolable {
    protected Point2D position = new Point2D();

    public void printPosition() {
        System.out.printf("%s, position: %s%n", this, position);
    }

    public void setPosition(Point2D newPosition) {
        position = newPosition;
    }
}
