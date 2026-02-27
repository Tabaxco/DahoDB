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


        String insertEmployeeSQL = "INSERT INTO users (Id, Name, Registration_Date) VALUES (?, ?)";
        String insertTelephoneSQL = "INSERT INTO telephones (User_Id, Telephone) VALUES (?, ?)";
        String insertEmailSQL = "INSERT INTO emails (User_Id, Email) VALUES (?,?)";
        String inserRole = "INSERT INTO employee_roles (User_Id, Role) VALUES (?,?)";

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
        String findEmployee = "SELECT FROM users WHERE Id = ?";
        String findTelephonesSQL = "SELECT FROM telephones WHERE User_Id = ?";
        String findEmailSQL = "SELECT FROM emails WHERE User_Id = ?";
        String findRoleSQL = "SELECT FROM roles WHERE User_Id = ?";
        return null;
    }

    @Override
    public void update(Employee employee) {
        String updateEmployeeSQL = "UPDATE users SET Name = ? WHERE Id = ?";
        String updateEmailSQL = "UPDATE emails SET Telephone_Number = ? WHERE User_Id = ?";
        String updateTelephoneSQL = "UPDATE telephones SET Email = ? WHERE User_Id = ?";
        String updateRoleSQL = "UPDATE roles SET Role = ? WHERE User_Id = ?";
    }

    @Override
    public void delete(int id) {
        String deleteEmployeeSQL = "DELETE FROM users WHERE Id = ?";
        String deleteTelephoneSQL = "DELETE FROM telephones WHERE User_Id = ?";
        String deleteEmailSQL = "DELETE FROM emails WHERE User_Id = ?";
        String deleteRoleSQL = "DELETE FROM roles WHERE User_Id = ?";
    }

}
