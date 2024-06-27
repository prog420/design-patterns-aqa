package patterns.behavioral.state.v1.states;

public class Cancelled implements OrderState {
    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Trying to cancel already cancelled order.");
    }
}
