package patterns.behavioral.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * A concrete subject
 */
public class Order {
    private String id;
    private double itemCost;
    private int count;
    private double discount;

    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notify(Order order) {
        System.out.println("Notifying all observers...");
        observers.forEach(observer -> observer.updated(order));
    }

    public double getTotal() {
        return itemCost - discount;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void addItem(double price) {
        itemCost += price;
        count++;
        notify(this);
    }

    public int getCount() {
        return count;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
