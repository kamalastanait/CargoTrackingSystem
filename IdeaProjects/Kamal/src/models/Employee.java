package models;

public class Employee extends User {
    private String position;

    public Employee(int id, String name, String email, String position) {
        super(id, name, email);
        this.position = position;
    }

    // Геттер
    public String getPosition() {
        return position;
    }

    // Сеттер
    public void setPosition(String position) {
        this.position = position;
    }

    // Переопределение toString() для удобного вывода
    @Override
    public String toString() {
        return "Employee{id=" + getId() + ", name='" + getName() + "', email='" + getEmail() + "', position='" + position + "'}";
    }
}
