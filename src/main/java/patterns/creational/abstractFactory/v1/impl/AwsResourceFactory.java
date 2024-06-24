package patterns.creational.abstractFactory.v1.impl;

import patterns.creational.abstractFactory.v1.interfaces.Instance;
import patterns.creational.abstractFactory.v1.interfaces.ResourceFactory;
import patterns.creational.abstractFactory.v1.interfaces.Storage;

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
