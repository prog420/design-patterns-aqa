package patterns.creational.singleton.lazy;

/**
 * Lazy Singleton with Double-Checked Locking.
 * This implementation solves the multi-threading issue with lazy initialization
 * using volatile and double-check locking.
 * The volatile keyword is guaranteed to work only after JVM starting with
 * version 1.5 and later.
 */
public final class LazySingletonWithDCL {
    private LazySingletonWithDCL() {}

    // volatile indicates to not use cached version of this variable value
    private static volatile LazySingletonWithDCL INSTANCE;

    public static LazySingletonWithDCL getInstance() {
        if (INSTANCE == null) {
            // Prevent simultaneous null-checks from multiple threads
            synchronized (LazySingletonWithDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingletonWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}
