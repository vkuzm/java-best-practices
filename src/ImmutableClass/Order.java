package ImmutableClass;

import java.util.Date;

public final class Order {
    private final int orderId;
    private final String name;
    private final String lastName;
    private final int price;
    private final Date date;

    public Order(int orderId, String name, String lastName, int price, Date date) {
        this.orderId = orderId;
        this.name = name;
        this.lastName = lastName;
        this.price = price;
        this.date = new Date(date.getTime());
    }

    public int getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + getOrderId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", price=" + getPrice() +
                ", date=" + getDate() +
                '}';
    }
}
