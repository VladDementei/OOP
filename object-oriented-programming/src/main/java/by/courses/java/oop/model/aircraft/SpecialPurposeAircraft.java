package by.courses.java.oop.model.aircraft;

public abstract class SpecialPurposeAircraft extends Aircraft implements Cloneable{
    private boolean hasSpecialistsOnBoard;

    public SpecialPurposeAircraft(String producerCompany, String model, String tailNumber, double maxWeightCarriedKG,
                                  int maxFlightRangeKM, boolean hasSpecialistsOnBoard) {
        super(producerCompany, model, tailNumber, maxWeightCarriedKG, maxFlightRangeKM);
        this.hasSpecialistsOnBoard = hasSpecialistsOnBoard;
    }

    @Override
    public SpecialPurposeAircraft clone() throws CloneNotSupportedException {
        return (SpecialPurposeAircraft)super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", has specialists on board = " + hasSpecialistsOnBoard;
    }
}