package patterns.structural.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * Factory to get image object.
 */
public class ImageFactory {
    /** We'll provide proxy to caller instead of real object */
    public static Image getImage(String name) {
        return (Image) Proxy.newProxyInstance(
                ImageFactory.class.getClassLoader(), new Class[]{Image.class}, new ImageInvocationHandler(name)
        );
    }
}
