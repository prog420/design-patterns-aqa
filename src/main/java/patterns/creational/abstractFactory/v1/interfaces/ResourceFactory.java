package patterns.creational.abstractFactory.v1.interfaces;


/** Abstract Factory with methods defined for each object type */
public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMiB);
}
