package patterns.creational.abstractFactory.impl;

import patterns.creational.abstractFactory.interfaces.Instance;
import patterns.creational.abstractFactory.interfaces.ResourceFactory;
import patterns.creational.abstractFactory.interfaces.Storage;

/** Concrete Factory for AWS products */
public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMiB) {
        return new S3Storage(capMiB);
    }
}
