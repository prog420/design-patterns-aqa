package patterns.creational.abstractFactory.impl;

import patterns.creational.abstractFactory.interfaces.Instance;
import patterns.creational.abstractFactory.interfaces.ResourceFactory;
import patterns.creational.abstractFactory.interfaces.Storage;

/** Concrete Factory for Google Cloud products */
public class GoogleCloudResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMiB) {
        return new GoogleCloudStorage(capMiB);
    }
}
