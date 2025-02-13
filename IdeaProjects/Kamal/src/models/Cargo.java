package models;

public class Cargo {
    private int id;
    private String description;
    private double weight;
    private String status;

    public Cargo(int id, String description, double weight, String status) {
        this.id = id;
        this.description = description;
        setWeight(weight);  // Используем сеттер с проверкой
        setStatus(status);  // Используем сеттер с проверкой
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public String getStatus() {
        return status;
    }

    // Сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than 0.");
        }
        this.weight = weight;
    }

    public void setStatus(String status) {
        if (status.equalsIgnoreCase("Pending") || status.equalsIgnoreCase("Shipped") || status.equalsIgnoreCase("Delivered")) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status. Allowed values: Pending, Shipped, Delivered.");
        }
    }

    // Переопределяем toString() для удобного вывода
    @Override
    public String toString() {
        return "Cargo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                ", status='" + status + '\'' +
                '}';
    }
}
