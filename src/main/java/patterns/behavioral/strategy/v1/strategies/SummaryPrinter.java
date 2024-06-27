package patterns.behavioral.strategy.v1.strategies;

import patterns.behavioral.strategy.v1.Order;

import java.util.Collection;
import java.util.Iterator;

/**
 * Concrete Strategy
 */
public class SummaryPrinter implements OrderPrinter {
    @Override
    public void print(Collection<Order> orders) {
        double total = 0;
        System.out.println("******** Summary Report *********");
        Iterator<Order> iterator = orders.iterator();
        for (int i = 1; iterator.hasNext(); i++) {
            Order order = iterator.next();
            System.out.println(i + ". " + order.getId() + "\t" + order.getDate() + "\t"
                + order.getItems().size() + "\t" + order.getTotal());
            total += order.getTotal();
        }
        System.out.println("*********************************");
        System.out.println("Total Price: " + total);
    }
}
