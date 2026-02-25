package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Product;
import java.sql.*;


public class ProductDAO implements GenericDAO<Product> {

    @Override
    public void insert(Product product) {
        String sql = "INSERT INTO Product (Name, Description, Price, Height_cm, Weight_kg) VALUES (?,?,?,?,?)";
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(Product product) {
        String sql;
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM Product WHERE Id = ?";
    }
}
