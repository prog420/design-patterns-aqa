package patterns.creational.factoryMethod.v1.impl;

import patterns.creational.factoryMethod.v1.abc.Message;

/**
 * Concrete "product"
 */
public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "Text Message";
    }
}
