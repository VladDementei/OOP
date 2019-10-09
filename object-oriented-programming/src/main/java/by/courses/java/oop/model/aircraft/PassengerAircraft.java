package by.courses.java.oop.model.aircraft;

public class PassengerAircraft extends Aircraft {
    private int maxPassengersCarried;
    private boolean hasKitchen;

    public PassengerAircraft(String producerCompany, String model, String tailNumber, double maxWeightCarriedKG,
                             int maxFlightRangeKM, int maxPassengersCarried, boolean hasKitchen) {
        super(producerCompany, model, tailNumber, maxWeightCarriedKG, maxFlightRangeKM);
        this.maxPassengersCarried = maxPassengersCarried;
        this.hasKitchen = hasKitchen;
    }

    @Override
    public String toString() {
        return super.toString() + ", maximum number of passengers = " + maxPassengersCarried +
                ", is kitchen available on board = " + hasKitchen;
    }
}
