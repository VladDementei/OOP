package by.courses.java.oop.model.aircraft;

public abstract class Aircraft implements Cloneable{
    private String producerCompany;
    private String model;
    private String tailNumber;
    private double maxWeightCarriedKG;
    private int maxFlightRangeKM;

    protected Aircraft(String producerCompany, String model, String tailNumber,
                    double maxWeightCarriedKG, int maxFlightRangeKM) {
        this.producerCompany = producerCompany;
        this.model = model;
        this.tailNumber = tailNumber;
        this.maxWeightCarriedKG = maxWeightCarriedKG;
        this.maxFlightRangeKM = maxFlightRangeKM;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public double getMaxWeightCarriedKG() {
        return maxWeightCarriedKG;
    }

    public int getMaxFlightRangeKM() {
        return maxFlightRangeKM;
    }

    @Override
    public String toString() {
        return "Aircraft: producer company \"" + producerCompany + "\", model \"" + model +
                "\", tail number \"" + tailNumber + "\", maximum weight carried = " + maxWeightCarriedKG +"kg" +
                ", maximum flight range = " + maxFlightRangeKM + "km";
    }

    @Override
    public Aircraft clone() throws CloneNotSupportedException {
        return (Aircraft)super.clone();
    }
}