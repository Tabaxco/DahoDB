package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Employee;

import java.sql.SQLException;

public class EmployeeDAO implements GenericDAO<Employee> {

    @Override
    public void insert(Employee employee) {

    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(int id) {

    }

}
