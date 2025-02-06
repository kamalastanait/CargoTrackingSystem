package service;

class Tracking {
    private int cargoId;
    private String location;
    private String status;

    public Tracking(int cargoId, String location, String status) {
        this.cargoId = cargoId;
        this.location = location;
        this.status = status;
    }
}

