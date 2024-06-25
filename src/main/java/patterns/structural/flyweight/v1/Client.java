package patterns.structural.flyweight.v1;

public class Client {
    public static void main(String[] args) {
        SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(
            ErrorMessageFactory.ErrorType.GenericSystemError
        );
        System.out.println(msg1.getText("4056"));
    }
}
