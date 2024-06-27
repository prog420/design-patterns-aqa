package patterns.behavioral.state.v1.states;

public class InTransit implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for cancellation");
        System.out.println("Contacting payment gateway to rollback transaction");
        return 20;
    }
}
