package model;

public class Employee extends User{
    private String department;
    private String role;

    public Employee() {
    }

    public Employee(int id, String name, String telephoneNumber, String email, String department, String role) {
        super(id, name, telephoneNumber, email);
        this.department = department;
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
