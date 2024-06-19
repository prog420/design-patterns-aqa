package patterns.creational.abstractFactory.impl;

import patterns.creational.abstractFactory.interfaces.Instance;
import patterns.creational.abstractFactory.interfaces.Storage;

public class GoogleComputeEngineInstance implements Instance {
    public GoogleComputeEngineInstance(Capacity capacity) {
        // Map capacity to GCP instance types. Use GCP API to provision
        System.out.println("Created Google Compute Engine Instance");
    }

    @Override
    public void start() {
        System.out.println("Google Compute Engine Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Google Compute Engine Instance");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute Engine Instance stopped");
    }
}
