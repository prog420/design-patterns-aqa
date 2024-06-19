package patterns.creational.abstractFactory.impl;

import patterns.creational.abstractFactory.interfaces.Instance;
import patterns.creational.abstractFactory.interfaces.Storage;

public class Ec2Instance implements Instance {
    public Ec2Instance(Capacity capacity) {
        // Map capacity to ec2 instance types. Use AWS API to provision
        System.out.println("Created Ec2Instance");
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Ec2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped");
    }
}
