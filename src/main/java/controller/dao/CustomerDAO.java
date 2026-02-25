package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Customer;
import java.sql.*;

public class CustomerDAO implements GenericDAO<Customer> {


    @Override
    public void insert(Customer customer) {
        String insertCustomerSQL = "INSERT INTO customers (Id, Name, Registration_Date) VALUES (?, ?)";
        String insertTelephoneSQL = "INSERT INTO customer_telephones (Id, Telephone_Number) VALUES (?,?)";
        String insertEmailSQL = "INSERT INTO customer_emails (Id, Email) VALUES (?,?)";

        try (Connection conn = ConnectionFactory.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
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
