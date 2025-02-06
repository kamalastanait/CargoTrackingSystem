package models;

class Admin extends User {
    public Admin(int id, String name, String email) {
        super(id, name, email);
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }
}

