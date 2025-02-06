package models;

class Shipment {
    private int id;
    private int cargoId;
    private int customerId;
    private String deliveryDate;

    public Shipment(int id, int cargoId, int customerId, String deliveryDate) {
        this.id = id;
        this.cargoId = cargoId;
        this.customerId = customerId;
        this.deliveryDate = deliveryDate;
    }
}
