package patterns.creational.prototype.v1.geometry;

public class Point2D extends java.awt.geom.Point2D {
    private double x;
    private double y;

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
