package by.courses.java.oop.model.aircraft;

public abstract class Aircraft {
    private String producerCompany;
    private String model;
    private String tailNumber;
    private double maxWeightCarriedKG;
    private int maxFlightRangeKM;

    public Aircraft(String producerCompany, String model, String tailNumber,
                    double maxWeightCarriedKG, int maxFlightRangeKM) {
        this.producerCompany = producerCompany;
        this.model = model;
        this.tailNumber = tailNumber;
        this.maxWeightCarriedKG = maxWeightCarriedKG;
        this.maxFlightRangeKM = maxFlightRangeKM;
    }

    @Override
    public String toString() {
        return "Aircraft: producer company \"" + producerCompany + "\", model \"" + model +
                "\", tail number \"" + tailNumber + "\", maximum weight carried = " + maxWeightCarriedKG +"kg" +
                ", maximum flight range = " + maxFlightRangeKM + "km";
    }
}
