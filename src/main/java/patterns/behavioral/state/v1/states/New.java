package patterns.behavioral.state.v1.states;

public class New implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Handling cancellation of the New Order");
        return 0;
    }
}
