package patterns.structural.proxy.virtual;

public class Point2D {
    int x;
    int y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D(%s, %s)".formatted(x, y);
    }
}
