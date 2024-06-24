package patterns.creational.abstractFactory.v1.impl;


import patterns.creational.abstractFactory.v1.interfaces.Storage;

/** Represents a concrete product from the Google Cloud products family */
public class GoogleCloudStorage implements Storage {
    public GoogleCloudStorage(int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
}
