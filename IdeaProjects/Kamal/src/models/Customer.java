package models;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String phone; // Возможно, добавлено новое поле

    // Конструктор с 4 параметрами (если он есть)
    public Customer(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Добавьте перегруженный конструктор с 3 параметрами
    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = ""; // или null, если поле phone не обязательно
    }
}
