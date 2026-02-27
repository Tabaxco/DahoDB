package controller.dao;

import controller.dao.interfaces.GenericDAO;
import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO implements GenericDAO<Employee> {

    @Override
    public void insert(Employee employee) {

        String insertEmployeeSQL = "INSERT INTO employees (Id, Name) VALUES (?, ?)";
        String insertTelephoneSQL = "INSERT INTO employee_telephones (Employee_Id, Telephone) VALUES (?, ?)";
        String insertEmailSQL = "INSERT INTO employee_emails (Employee_Id, Email) VALUES (?,?)";

        try (Connection conn = ConnectionFactory.getConnection()) {
            conn.setAutoCommit(false);
            try(PreparedStatement stmtEmployee = conn.prepareStatement(insertEmployeeSQL, Statement.RETURN_GENERATED_KEYS)) {
                stmtEmployee.setInt(1, employee.getId());
                stmtEmployee.setString(2, employee.getName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void update(Employee employee) {
        String updateEmployeeSQL = "UPDATE users SET Name = ? WHERE Id = ?";
        String updateEmployeeSQL = "UPDATE  SET "
    }

    @Override
    public void delete(int id) {

        String deleteEmployeeSQL = "DELETE FROM employees WHERE Id = ?";
        String deleteEmployeeTelephoneSQL = "DELETE FROM employee_telephones WHERE Employee_Id = ?";
        String deleteEmployeeEmailSQL = "DELETE FROM employee_emails WHERE Employee_Id = ?";
    }

}
