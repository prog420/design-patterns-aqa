package patterns.behavioral.strategy.v1.strategies;

import patterns.behavioral.strategy.v1.Order;

import java.util.Collection;
import java.util.Iterator;

/**
 * Concrete Strategy
 */
public class TotalPricePrinter implements OrderPrinter {
    @Override
    public void print(Collection<Order> orders) {
        double total = 0;
        System.out.println("******** Price Report *********");
        Iterator<Order> iterator = orders.iterator();
        for (int i = 1; iterator.hasNext(); i++) {
            Order order = iterator.next();
            total += order.getTotal();
        }
        System.out.println("Total Price: " + total);
    }
}
