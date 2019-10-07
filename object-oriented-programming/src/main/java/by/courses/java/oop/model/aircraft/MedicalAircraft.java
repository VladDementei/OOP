package by.courses.java.oop.model.aircraft;

import java.util.List;

public class MedicalAircraft extends SpecialPurposeAircraft {
    private enum MedicalEquipment{TOMOGRAPH, VENTILATOR, ULTRASOUND_MACHINE}

    private List<MedicalEquipment> onBoardEquipment;
}
