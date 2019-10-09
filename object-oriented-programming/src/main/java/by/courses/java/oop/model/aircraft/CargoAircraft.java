package by.courses.java.oop.model.aircraft;

public class CargoAircraft extends Aircraft {
    private double maxCargoLengthMetres;
    private double maxCargoWidthMetres;
    private double maxCargoHeightMetres;

    public CargoAircraft(String producerCompany, String model, String tailNumber, double maxWeightCarriedKG,
                         int maxFlightRangeKM, double maxCargoLengthMetres, double maxCargoWidthMetres,
                         double maxCargoHeightMetres) {
        super(producerCompany, model, tailNumber, maxWeightCarriedKG, maxFlightRangeKM);
        this.maxCargoLengthMetres = maxCargoLengthMetres;
        this.maxCargoWidthMetres = maxCargoWidthMetres;
        this.maxCargoHeightMetres = maxCargoHeightMetres;
    }

    @Override
    public String toString() {
        return super.toString() + ", max cargo dimensions (L*W*H) = " +
                maxCargoLengthMetres + "*" + maxCargoWidthMetres + "*" + maxCargoHeightMetres + " metres";
    }
}
