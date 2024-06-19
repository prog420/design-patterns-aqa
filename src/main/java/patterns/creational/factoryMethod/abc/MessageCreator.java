package patterns.creational.factoryMethod.abc;

/**
 * This is our abstract "creator".
 */
public abstract class MessageCreator {
    public Message getMessage() {
        Message msg = createMessage();
        // Perform some operations on created "product" if needed
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    /** Factory method */
    public abstract Message createMessage();
}
