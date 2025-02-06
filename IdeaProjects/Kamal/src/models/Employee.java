package models;

class Employee extends User {
    private String position;

    public Employee(int id, String name, String email, String position) {
        super(id, name, email);
        this.position = position;
    }
}

