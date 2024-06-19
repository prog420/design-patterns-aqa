package patterns.creational.factoryMethod.impl;

import patterns.creational.factoryMethod.abc.Message;
import patterns.creational.factoryMethod.abc.MessageCreator;


/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
