public enum CarType {

    PETROL("Petrol"),
    DIESEL("Diesel"),
    HYBRID("Hybrid"),
    ELECTRIC("Electric");

    private final String carType;


    CarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }
}
