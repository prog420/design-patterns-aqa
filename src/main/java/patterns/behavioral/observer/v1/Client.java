package patterns.behavioral.observer.v1;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("100");
        PriceObserver priceObserver = new PriceObserver();
        order.attach(priceObserver);
        order.addItem(150);
        System.out.println("Total Price with discount: " + order.getTotal());
    }
}
