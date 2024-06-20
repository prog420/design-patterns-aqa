package patterns.creational.objectPool;

public abstract class GameObject {
    protected Point2D position = new Point2D();

    public Point2D getPosition() {
        System.out.printf("Position: %s%n", position);
        return position;
    }

    public void setPosition(Point2D newPosition) {
        this.position = newPosition;
    }
}
