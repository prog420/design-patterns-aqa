package patterns.behavioral.observer.v1;

/**
 * Concrete observer
 */
public class PriceObserver implements OrderObserver {
    @Override
    public void updated(Order order) {
        System.out.println("Observer: updated() call");
        double total = order.getItemCost();
        if (total >= 100) {
            order.setDiscount(10);
        }
    }
}
