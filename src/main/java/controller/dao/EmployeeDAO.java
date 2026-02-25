package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Employee;

import java.sql.SQLException;

public class EmployeeDAO implements GenericDAO<Employee> {

    @Override
    public void insert(Employee employee) {
        String sql = "INSERT INTO Employee (Name) VALUES (?)";
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void update(Employee employee) {
        String sql;
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM Employee WHERE Id = ?";
    }

}
