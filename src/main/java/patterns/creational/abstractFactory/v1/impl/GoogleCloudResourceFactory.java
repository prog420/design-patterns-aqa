package patterns.creational.abstractFactory.v1.impl;

import patterns.creational.abstractFactory.v1.interfaces.Instance;
import patterns.creational.abstractFactory.v1.interfaces.ResourceFactory;
import patterns.creational.abstractFactory.v1.interfaces.Storage;

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
