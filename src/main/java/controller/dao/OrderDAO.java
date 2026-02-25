package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Order;

public class OrderDAO implements GenericDAO<Order> {

    @Override
    public void insert(Order order) {

        String insertOrder = "INSERT INTO Order ()";
        String insertOrderItem = "INSERT INTO order_items (Order_Id, Customer_Id) VALUES (?,?)";
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

        String deleteOrder = "DELETE FROM orders WHERE Id = ?";
        String deleteOrderItem = "DETELE FROM order_items WHERE Order_Id = ?";
    }
}
