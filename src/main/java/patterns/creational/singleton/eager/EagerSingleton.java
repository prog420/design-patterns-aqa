package patterns.creational.singleton.eager;


/** Example of eager singleton */
public class EagerSingleton {
    private EagerSingleton() {}

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
