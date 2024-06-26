package patterns.structural.proxy.virtual;

/**
 * Example of Virtual Proxy (delays construction of original object).
 */
public class ImageProxy implements Image {
    private BitmapImage image;
    private String name;
    private Point2D location;
    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(Point2D point2D) {
        if (image != null) {
            image.setLocation(point2D);
        } else {
            location = point2D;
        }
    }

    @Override
    public Point2D getLocation() {
        if (image != null) {
            return image.getLocation();
        }
        return location;
    }

    /**
     * Proxy can't render image without a real image object,
     * so we need to create image object if not image was provided before
     */
    @Override
    public void render() {
        if (image == null) {
            image = new BitmapImage(name);
            if (location != null) {
                image.setLocation(location);
            }
        }
        image.render();
    }
}
