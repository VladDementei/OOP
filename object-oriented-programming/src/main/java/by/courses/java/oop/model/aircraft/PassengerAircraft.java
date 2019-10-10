package by.courses.java.oop.model.aircraft;

public class PassengerAircraft extends Aircraft implements Cloneable{
    private int maxPassengersCarried;
    private boolean hasKitchen;

    public PassengerAircraft(String producerCompany, String model, String tailNumber, double maxWeightCarriedKG,
                             int maxFlightRangeKM, int maxPassengersCarried, boolean hasKitchen) {
        super(producerCompany, model, tailNumber, maxWeightCarriedKG, maxFlightRangeKM);
        this.maxPassengersCarried = maxPassengersCarried;
        this.hasKitchen = hasKitchen;
    }

    public int getMaxPassengersCarried() {
        return maxPassengersCarried;
    }

    @Override
    public PassengerAircraft clone() throws CloneNotSupportedException {
        return (PassengerAircraft)super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", maximum number of passengers = " + maxPassengersCarried +
                ", is kitchen available on board = " + hasKitchen;
    }
}