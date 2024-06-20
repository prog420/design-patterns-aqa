package patterns.creational.objectPool;

public class Client {
    public static final ObjectPool<Bullet> bulletPool = new ObjectPool<>(Bullet::new, 5);
    public static void main(String[] args) {
        // Create new objects
        Bullet b1 = bulletPool.get();
        b1.setPosition(new Point2D(1, 1));
        Bullet b2 = bulletPool.get();
        b2.setPosition(new Point2D(4, 5));

        b1.printPosition();
        b2.printPosition();
        // Release created objects
        bulletPool.release(b1);
        bulletPool.release(b2);

        b1.printPosition();
        b2.printPosition();
    }
}
