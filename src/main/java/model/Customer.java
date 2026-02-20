package model;

public class Customer extends User {

    public Customer () {
    }

    public Customer(int id, String name, String telephoneNumber, String email) {
        super(id, name, telephoneNumber, email);
    }
}
