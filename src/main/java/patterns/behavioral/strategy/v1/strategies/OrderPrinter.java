package patterns.behavioral.strategy.v1.strategies;

import patterns.behavioral.strategy.v1.Order;

import java.util.Collection;

/**
 * Abstract Strategy
 */
public interface OrderPrinter {
    void print(Collection<Order> orders);
}
