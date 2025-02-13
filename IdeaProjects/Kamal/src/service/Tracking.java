package service;

public class Tracking {
    private int cargoId;
    private String location;
    private String status;

    public Tracking(int cargoId, String location, String status) {
        this.cargoId = cargoId;
        this.location = location;
        setStatus(status); // Используем сеттер с проверкой
    }

    // Геттеры
    public int getCargoId() {
        return cargoId;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    // Сеттеры
    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStatus(String status) {
        if (status.equalsIgnoreCase("In Transit") || status.equalsIgnoreCase("Delivered") || status.equalsIgnoreCase("Pending")) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status. Allowed values: In Transit, Delivered, Pending.");
        }
    }

    // Переопределяем toString() для удобного вывода
    @Override
    public String toString() {
        return "Tracking{" +
                "cargoId=" + cargoId +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
