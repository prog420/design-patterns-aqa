package patterns.creational.singleton.lazy;

import patterns.creational.singleton.eager.EagerSingleton;

public class Client {
    public static void main(String[] args) {
        LazySingletonWithDCL lazySingleton = LazySingletonWithDCL.getInstance();
        LazySingletonWithDCL lazySingleton2 = LazySingletonWithDCL.getInstance();

        System.out.println(lazySingleton);
        System.out.println(lazySingleton2);
    }
}
