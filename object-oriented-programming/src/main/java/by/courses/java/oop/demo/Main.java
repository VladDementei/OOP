package by.courses.java.oop.demo;

import by.courses.java.oop.comporator.AircraftsRangeComparator;
import by.courses.java.oop.model.aircraft.CargoAircraft;
import by.courses.java.oop.model.aircraft.FireFighterAircraft;
import by.courses.java.oop.model.aircraft.MedicalAircraft;
import by.courses.java.oop.model.aircraft.PassengerAircraft;
import by.courses.java.oop.model.airline.Airline;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline("Lufthansa", Airline.PricingPolicy.NORMAL);

        airline.addAircraft(new CargoAircraft("Boeing", "740", "LUF16",
                41500, 6000, 60, 3, 2.5));
        airline.addAircraft(new CargoAircraft("Airbus", "Beluga XL", "LUF25",
                53000, 4000, 40, 5, 5));
        airline.addAircraft(new CargoAircraft("Aero Spacelines", "Super Guppy", "LUF26",
                24000, 3400, 25, 4, 4));
        airline.addAircraft(new CargoAircraft("Lockheed", "C-5 Galaxy", "LUF28",
                28000, 4200, 35, 3.5, 3.4));

        airline.addAircraft(new PassengerAircraft("Boeing", "747-400", "LUF12",
                32400, 5000, 200, true));
        airline.addAircraft(new PassengerAircraft("Boeing", "777x", "LUF13",
                33400, 5500, 220, true));
        airline.addAircraft(new PassengerAircraft("Airbus", "A320neo family", "LUF14",
                25600, 3000, 160, false));
        airline.addAircraft(new PassengerAircraft("Boeing", "787 Dreamliner", "LUF17",
                35200, 5300, 250, false));
        airline.addAircraft(new PassengerAircraft("Airbus", "A380", "LUF19",
                50600, 8000, 525, true));

        airline.addAircraft(new FireFighterAircraft("Boeing", "740", "LUF120",
                31000, 1000, false, 2000, true));
        airline.addAircraft(new FireFighterAircraft("Boeing", "747", "LUF120",
                35000, 2000, false, 3000, false));

        airline.addAircraft(new MedicalAircraft("Boeing", "777", "LUF130",
                10000, 2000, true,
                Arrays.asList(MedicalAircraft.MedicalEquipment.TOMOGRAPH, MedicalAircraft.MedicalEquipment.VENTILATOR)));
        airline.addAircraft(new MedicalAircraft("Airbus", "A320", "LUF131",
                12000, 3000, true,
                Arrays.asList(MedicalAircraft.MedicalEquipment.TOMOGRAPH, MedicalAircraft.MedicalEquipment.VENTILATOR, MedicalAircraft.MedicalEquipment.ULTRASOUND_MACHINE)));
        airline.addAircraft(new MedicalAircraft("Airbus", "A310", "LUF132",
                11000, 4500, true,
                Arrays.asList(MedicalAircraft.MedicalEquipment.TOMOGRAPH)));

        startConsoleDialog(airline);
    }

    private static void startConsoleDialog(Airline airline){
        Scanner consoleScanner = new Scanner(System.in);
        ConsolePrinter.startConsolePrinter();
        USER_DIALOG: while (true){
            ConsolePrinter.printExecuteLine();
            switch (consoleScanner.next()){
                case "1": {
                    ConsolePrinter.printCommandsList();
                    break;
                }case "2":{
                    ConsolePrinter.printTotalMaximumWeightCarried(airline.countTotalMaximumWeightCarried());
                    break;
                }case "3":{
                    ConsolePrinter.printTotalAmountPassengersSeats(airline.countTotalAmountPassengersSeats());
                    break;
                }case "4":{
                    airline.sort(new AircraftsRangeComparator());
                    ConsolePrinter.printSortedAirline(airline);
                    break;
                }case "5":{
                    break;
                }case "6":{
                    break USER_DIALOG;
                }default: {
                    ConsolePrinter.printWrongValue();
                }
            }

        }
    }
}