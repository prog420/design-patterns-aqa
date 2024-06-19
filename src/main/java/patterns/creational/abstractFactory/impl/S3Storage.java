package patterns.creational.abstractFactory.impl;


import patterns.creational.abstractFactory.interfaces.Storage;

/** Represents a concrete product from the AWS products family */
public class S3Storage implements Storage {
    public S3Storage(int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
