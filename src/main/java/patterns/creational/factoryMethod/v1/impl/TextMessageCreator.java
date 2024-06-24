package patterns.creational.factoryMethod.v1.impl;

import patterns.creational.factoryMethod.v1.abc.Message;
import patterns.creational.factoryMethod.v1.abc.MessageCreator;


/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
