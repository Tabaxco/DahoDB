package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Product;

import java.sql.*;


public class ProductDAO implements GenericDAO<Product> {

    @Override
    public void insert(Product product) {


    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
