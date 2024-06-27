package patterns.behavioral.strategy.v1;

import patterns.behavioral.strategy.v1.strategies.OrderPrinter;

import java.util.LinkedList;

/**
 * Context
 */
public class PrintService {
    private OrderPrinter printer;

    /**
     * Accepts one of the Strategy implementations.
     */
    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    /**
     * Passes context to the Strategy.
     */
    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
