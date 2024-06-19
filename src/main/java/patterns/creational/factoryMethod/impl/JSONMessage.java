package patterns.creational.factoryMethod.impl;

import patterns.creational.factoryMethod.abc.Message;

/**
 * Concrete "product"
 */
public class JSONMessage extends Message {
    @Override
    public String getContent() {
        return "JSON Message";
    }
}
