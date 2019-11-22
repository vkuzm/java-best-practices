package NullObject;

public class NullCustomer extends Customer {

    @Override
    public String getName() {
        return "Guest";
    }

    @Override
    public int getAge() {
        return 0;
    }
}
