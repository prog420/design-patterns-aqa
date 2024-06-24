package patterns.creational.abstractFactory.v1.interfaces;


/** Represents an abstract product */
public interface Instance {
    enum Capacity { micro, small, large }

    void start();

    void attachStorage(Storage storage);

    void stop();
}
