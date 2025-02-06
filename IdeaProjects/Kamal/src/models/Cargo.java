package models;

class Cargo {
    private int id;
    private String description;
    private double weight;
    private String status;

    public Cargo(int id, String description, double weight, String status) {
        this.id = id;
        this.description = description;
        this.weight = weight;
        this.status = status;
    }
}
