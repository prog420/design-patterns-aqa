package patterns.structural.proxy.virtual;

/**
 * Interface implemented by proxy and concrete objects
 */
public interface Image {
    void setLocation(Point2D point2D);

    Point2D getLocation();

    void render();
}
