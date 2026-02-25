package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Employee;

import java.sql.SQLException;

public class EmployeeDAO implements GenericDAO<Employee> {

    @Override
    public void insert(Employee employee) {

        String insertEmployeeSQL = "INSERT INTO employees (Id, Name) VALUES (?, ?)";
        String insertTelephoneSQL = "INSERT INTO employee_telephones (Employee_Id, Telephone) VALUES (?, ?)";
        String insertEmailSQL = "INSERT INTO employee_emails (Employee_Id, Email) VALUES (?,?)";
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

        String deleteEmployee = "DELETE FROM employees WHERE Id = ?";
        String deleteEmployeeTelephone = "DELETE FROM employee_telephones WHERE Employee_Id = ?";
        String deleteEmployeeEmail = "DELETE FROM employee_emails WHERE Employee_Id = ?";
    }

}
