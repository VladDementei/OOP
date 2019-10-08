package by.courses.java.oop.model.aircraft;

public class FireFighterAircraft extends SpecialPurposeAircraft {
    private double waterVolumeM3;
    private boolean hasInflightWaterIntake;

    public FireFighterAircraft(String producerCompany, String model, String tailNumber, double maxWeightCarriedKG,
                               int maxFlightRangeKM, boolean hasSpecialistsOnBoard, double waterVolumeM3,
                               boolean hasInflightWaterIntake) {
        super(producerCompany, model, tailNumber, maxWeightCarriedKG, maxFlightRangeKM, hasSpecialistsOnBoard);
        this.waterVolumeM3 = waterVolumeM3;
        this.hasInflightWaterIntake = hasInflightWaterIntake;
    }
}
