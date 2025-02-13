package models;

public class Admin extends User {
    public Admin(int id, String name, String email) {
        super(id, name, email);
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }

    // Дополнительные методы (примерные)
    public void deleteUser(int userId) {
        System.out.println("Deleting user with ID: " + userId);
    }

    public void addUser(String name, String email) {
        System.out.println("Adding new user: " + name + " (" + email + ")");
    }

    public void viewReports() {
        System.out.println("Viewing reports...");
    }

    // Переопределение toString() для удобного вывода
    @Override
    public String toString() {
        return "Admin{id=" + getId() + ", name='" + getName() + "', email='" + getEmail() + "'}";
    }
}

