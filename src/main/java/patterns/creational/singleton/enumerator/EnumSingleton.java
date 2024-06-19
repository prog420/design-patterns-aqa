package patterns.creational.singleton.enumerator;


/**
 * (Ref. Google I/O 2k8 Joshua Block)
 * Since Java 1.5 using enum we can create a singleton. It handles serialization
 * using Java's in-built mechanism and still ensure single instance.
 * */
public enum EnumSingleton {
    INSTANCE;

    public void getConfiguration() {

    }

}
