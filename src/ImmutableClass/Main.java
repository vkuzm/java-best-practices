package ImmutableClass;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Order order = new Order(1, "Nick", "Black", 2500, date);

        // #1 Trying to change the immutable object
        Date d = order.getDate();
        d.setTime(0);

        // #2 Trying to change the date that passed to the immutable object
        date.setTime(0);

        System.out.println(order.toString());
    }
}
