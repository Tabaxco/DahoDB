package model;

public class Employee extends User{
    private String role;

    public Employee() {
    }

    public Employee(int id, String name, String telephoneNumber, String email, String role) {
        super(id, name, telephoneNumber, email);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
