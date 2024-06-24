package patterns.creational.abstractFactory.v1;

import patterns.creational.abstractFactory.v1.impl.AwsResourceFactory;
import patterns.creational.abstractFactory.v1.impl.GoogleCloudResourceFactory;
import patterns.creational.abstractFactory.v1.interfaces.Instance;
import patterns.creational.abstractFactory.v1.interfaces.Instance.Capacity;
import patterns.creational.abstractFactory.v1.interfaces.ResourceFactory;
import patterns.creational.abstractFactory.v1.interfaces.Storage;

public class Client {
    public static void main(String[] args) {
        Instance aws = createServer(new AwsResourceFactory(), Capacity.small, 4098);
        aws.start();
        aws.stop();

        Instance cloud = createServer(new GoogleCloudResourceFactory(), Capacity.large, 20480);
        cloud.start();
        cloud.stop();
    }

    public static Instance createServer(ResourceFactory factory, Instance.Capacity cap, int storageMiB) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMiB);
        instance.attachStorage(storage);
        return instance;
    }
}
