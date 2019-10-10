package by.courses.java.oop.demo;

import by.courses.java.oop.check.FireFighterWaterVolumeChecker;
import by.courses.java.oop.check.RangeWeightCarriedChecker;
import by.courses.java.oop.comporator.AircraftsRangeComparator;
import by.courses.java.oop.model.aircraft.*;
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

        Aircraft fireFighterAircraft= new FireFighterAircraft("Boeing", "740", "LUF120",
                31000, 1000, false, 2000, true);
        airline.addAircraft(fireFighterAircraft);
        try {
            FireFighterAircraft copy = ((FireFighterAircraft) fireFighterAircraft).clone();
            copy.setTailNumber("LUF121");
            airline.addAircraft(copy);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        airline.addAircraft(new FireFighterAircraft("Boeing", "747", "LUF122",
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
        CommandsPrinter.startConsolePrinter();
        USER_DIALOG: while (true){
            CommandsPrinter.printExecuteLine();
            switch (consoleScanner.next()){
                case "1": {
                    CommandsPrinter.printCommandsList();
                    break;
                }case "2":{
                    CommandsPrinter.printFleet(airline);
                    break;
                }case "3":{
                    CommandsPrinter.printTotalMaximumWeightCarried(airline.countTotalMaximumWeightCarried());
                    break;
                }case "4":{
                    CommandsPrinter.printTotalAmountPassengersSeats(airline.countTotalAmountPassengersSeats());
                    break;
                }case "5":{
                    airline.sort(new AircraftsRangeComparator());
                    CommandsPrinter.printSortedAirline(airline);
                    break;
                }case "6":{
                    CommandsPrinter.printFilteredAircrafts(
                            airline.filter(new RangeWeightCarriedChecker(),
                            new PassengerAircraft(null, null, null, 2000, 2000, 0, false),
                            new PassengerAircraft(null, null, null, 50000, 5000, 0, false)));
                    break;
                }case "7":{
                    CommandsPrinter.printFilteredAircrafts(
                            airline.filter(new FireFighterWaterVolumeChecker(),
                                    new FireFighterAircraft(null, null, null, 0, 0, false, 2500, true),
                                    new FireFighterAircraft(null, null, null, 0, 0, false, 3500, true)));
                    break;
                }case "8":{
                    break USER_DIALOG;
                }default: {
                    CommandsPrinter.printWrongValue();
                }
            }
        }
    }
}