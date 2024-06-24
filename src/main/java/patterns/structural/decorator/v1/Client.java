package patterns.structural.decorator.v1;

public class Client {
    public static void main(String[] args) {
        Message m = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(m.getContent());
        Message decoratedMessage = new HtmlEncodedMessage(m);
        System.out.println(decoratedMessage.getContent());

    }
}
