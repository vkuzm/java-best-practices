package NullObject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        populateCustomers();

        // Find an existed customer
        Customer existedCustomer = findCustomerByName("Max");
        System.out.println(existedCustomer.toString());

        // Find an not existed customer
        Customer notExistedCustomer = findCustomerByName("Mike");
        System.out.println(notExistedCustomer.toString());
    }

    private static void populateCustomers() {
        Customer customer1 = new Customer();
        customer1.setName("Nick");
        customer1.setAge(25);

        Customer customer2 = new Customer();
        customer2.setName("Max");
        customer2.setAge(33);

        customers.add(customer1);
        customers.add(customer2);
    }

    private static Customer findCustomerByName(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }

        return new NullCustomer();
    }

}
