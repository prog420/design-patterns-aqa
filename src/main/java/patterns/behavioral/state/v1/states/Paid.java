package patterns.behavioral.state.v1.states;

public class Paid implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Handling cancellation of the Paid Order - " +
                "contacting payment gateway to rollback transaction");
        return 10;
    }
}
