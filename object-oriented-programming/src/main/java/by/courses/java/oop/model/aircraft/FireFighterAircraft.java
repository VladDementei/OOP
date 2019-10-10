package by.courses.java.oop.model.aircraft;

public class FireFighterAircraft extends SpecialPurposeAircraft implements Cloneable{
    private double waterVolumeM3;
    private boolean hasInflightWaterIntake;

    public FireFighterAircraft(String producerCompany, String model, String tailNumber, double maxWeightCarriedKG,
                               int maxFlightRangeKM, boolean hasSpecialistsOnBoard, double waterVolumeM3,
                               boolean hasInflightWaterIntake) {
        super(producerCompany, model, tailNumber, maxWeightCarriedKG, maxFlightRangeKM, hasSpecialistsOnBoard);
        this.waterVolumeM3 = waterVolumeM3;
        this.hasInflightWaterIntake = hasInflightWaterIntake;
    }

    public double getWaterVolumeM3() {
        return waterVolumeM3;
    }

    @Override
    public FireFighterAircraft clone() throws CloneNotSupportedException {
        return (FireFighterAircraft)super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", water volume = " + waterVolumeM3 + "m3" +
                ", has in-flight water intake = " + hasInflightWaterIntake;
    }
}