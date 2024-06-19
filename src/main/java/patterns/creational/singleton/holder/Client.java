package patterns.creational.singleton.holder;

public class Client {
    public static void main(String[] args) {
        LazySingletonWithHolder lazySingletonWithHolder = LazySingletonWithHolder.getInstance();
        LazySingletonWithHolder lazySingletonWithHolder2 = LazySingletonWithHolder.getInstance();

        System.out.println(lazySingletonWithHolder);
        System.out.println(lazySingletonWithHolder2);
    }
}
