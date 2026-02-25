package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Product;
import java.sql.*;


public class ProductDAO implements GenericDAO<Product> {

    @Override
    public void insert(Product product) {
        String insertProductSQL = "INSERT INTO products (Name, Description, Price, Height_cm, Weight_kg) VALUES (?,?,?,?,?)";
        String insertStockSQL = "INSERT INTO stock (Product_Id, Quantity) VALUES (?,?)";

        try (Connection conn = ConnectionFactory.getConnection()) {

        } catch (SQLException e) {

        }
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

        String deleteProductSQL = "DELETE FROM products WHERE Id = ?";
        String deleteStockSQL = "DELETE FROM stock WHERE Product_Id = ?";
    }
}
