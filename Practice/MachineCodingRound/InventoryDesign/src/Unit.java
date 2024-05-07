public class Unit {
    private String unitId;
    private String productId;
    private String locationId;
    private Status status;

    public Unit(String unitId, String productId, String locationId) {
        this.unitId = unitId;
        this.productId = productId;
        this.locationId = locationId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
