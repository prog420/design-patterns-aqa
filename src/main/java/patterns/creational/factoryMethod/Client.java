package patterns.creational.factoryMethod;


import patterns.creational.factoryMethod.abc.Message;
import patterns.creational.factoryMethod.abc.MessageCreator;
import patterns.creational.factoryMethod.impl.JSONMessageCreator;
import patterns.creational.factoryMethod.impl.TextMessageCreator;

public class Client {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator messageCreator) {
        Message message = messageCreator.getMessage();
        System.out.println(message.getContent());
    }
}
