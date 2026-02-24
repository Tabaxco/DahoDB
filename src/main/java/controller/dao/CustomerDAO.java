package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Customer;
import java.sql.*;

public class CustomerDAO implements GenericDAO<Customer> {


    @Override
    public void insert(Customer customer) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(int id) {

    }

}
