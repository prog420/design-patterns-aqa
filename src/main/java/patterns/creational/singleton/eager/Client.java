package patterns.creational.singleton.eager;

public class Client {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton);
        System.out.println(eagerSingleton2);
    }
}
