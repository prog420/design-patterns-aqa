package patterns.creational.factoryMethod.impl;

import patterns.creational.factoryMethod.abc.Message;
import patterns.creational.factoryMethod.abc.MessageCreator;


/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
