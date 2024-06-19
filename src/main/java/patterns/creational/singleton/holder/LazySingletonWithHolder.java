package patterns.creational.singleton.holder;

/**
 * Lazy initialization holder class.
 * This ensures that we have a lazy init without having to worry about synchronization.
 */
public final class LazySingletonWithHolder {
    private LazySingletonWithHolder() {}

    private static class Holder {
        static LazySingletonWithHolder INSTANCE = new LazySingletonWithHolder();
    }

    public static LazySingletonWithHolder getInstance() {
        return Holder.INSTANCE;
    }
}
