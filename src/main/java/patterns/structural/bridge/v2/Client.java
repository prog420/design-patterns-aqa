package patterns.structural.bridge.v2;

import patterns.structural.bridge.v2.devices.Device;
import patterns.structural.bridge.v2.devices.Radio;
import patterns.structural.bridge.v2.devices.TV;
import patterns.structural.bridge.v2.remotes.AdvancedRemote;
import patterns.structural.bridge.v2.remotes.BasicRemote;

public class Client {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
