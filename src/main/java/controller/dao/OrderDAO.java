package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Order;

public class OrderDAO implements GenericDAO<Order> {

    @Override
    public void insert(Order order) {
        String sql = "INSERT INTO Order ()";
    }

    @Override
    public Order findById(int id) {
        return null;
    }

    @Override
    public void update(Order order) {
        String sql;
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM Order WHERE Id = ?";
    }
}
