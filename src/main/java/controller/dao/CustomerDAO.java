package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Customer;
import java.sql.*;

public class CustomerDAO implements GenericDAO<Customer> {


    @Override
    public void insert(Customer customer) {
        String sql = "INSERT INTO Customer (Name, Registration_Date) VALUES (?, ?)";
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(Customer customer) {
        String sql;
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM Customer WHERE Id = ?";
    }

}
