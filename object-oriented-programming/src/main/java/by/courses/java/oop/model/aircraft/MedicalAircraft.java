package by.courses.java.oop.model.aircraft;

import java.util.List;

public class MedicalAircraft extends SpecialPurposeAircraft {
    public enum MedicalEquipment{TOMOGRAPH, VENTILATOR, ULTRASOUND_MACHINE}

    private List<MedicalEquipment> onBoardEquipment;

    public MedicalAircraft(String producerCompany, String model, String tailNumber, double maxWeightCarriedKG,
                           int maxFlightRangeKM, boolean hasSpecialistsOnBoard, List<MedicalEquipment> onBoardEquipment) {
        super(producerCompany, model, tailNumber, maxWeightCarriedKG, maxFlightRangeKM, hasSpecialistsOnBoard);
        this.onBoardEquipment = onBoardEquipment;
    }

    @Override
    public String toString() {
        return super.toString() + ", medical equipment on board = " + onBoardEquipment.toString();
    }
}
