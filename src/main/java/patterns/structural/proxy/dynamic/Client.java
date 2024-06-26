package patterns.structural.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        Image img = ImageFactory.getImage("A.bmp");
        img.setLocation(new Point2D(10, 10));
        img.render();
        System.out.println(img.getLocation());
        System.out.println(img);
    }
}
