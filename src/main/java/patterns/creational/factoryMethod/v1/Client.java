package patterns.creational.factoryMethod.v1;


import patterns.creational.factoryMethod.v1.abc.Message;
import patterns.creational.factoryMethod.v1.abc.MessageCreator;
import patterns.creational.factoryMethod.v1.impl.JSONMessageCreator;
import patterns.creational.factoryMethod.v1.impl.TextMessageCreator;

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
