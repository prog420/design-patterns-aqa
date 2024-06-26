package patterns.structural.proxy.virtual;

/**
 * Our concrete class providing actual functionality
 */
public class BitmapImage implements Image {
    private Point2D location;
    private String name;

    /**
     * Loads image from file.
     * But we don't need to load image immediately on instance creation, so we need a Virtual Proxy.
     */
    public BitmapImage(String filename) {
        System.out.println("Loaded from disk: " + filename);
        name = filename;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    @Override
    public void render() {
        System.out.println("Rendered " + this.name);
    }
}
