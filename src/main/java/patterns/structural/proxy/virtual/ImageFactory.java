package patterns.structural.proxy.virtual;

/**
 * Factory to get image objects.
 */
public class ImageFactory {
    public static Image getImage(String name) {
        return new ImageProxy(name);
    }
}
