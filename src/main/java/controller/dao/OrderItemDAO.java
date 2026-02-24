package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.OrderItem;


public class OrderItemDAO implements GenericDAO<OrderItem> {

    @Override
    public void insert(OrderItem orderItem) {
        String sql;
    }

    @Override
    public OrderItem findById(int id) {
        return null;
    }

    @Override
    public void update(OrderItem orderItem) {
        String sql;
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM OrderItem WHERE Id = ?";
    }
}
