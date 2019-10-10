package by.courses.java.oop.demo;

import by.courses.java.oop.model.aircraft.Aircraft;
import by.courses.java.oop.model.airline.Airline;

import java.util.List;

public class ConsolePrinter {

    static {
        COMMANDS_LIST = "Available commands: \n" +
                "1 - print command list\n" +
                "2 - print airline fleet\n" +
                "3 - count total maximum weight carried\n" +
                "4 - count total amount of places in passenger aircrafts\n" +
                "5 - sort by all aircrafts by maximum range\n" +
                "6 - search aircrafts by range and weight carried\n" +
                "7 - search firefighter aircrafts by water volume\n" +
                "8 - close application";
        EXECUTE = "Execute method ";
        ERROR = "Typed unresolved command";
    }
    private static final String COMMANDS_LIST;
    private static final String EXECUTE;
    private static final String ERROR;

    public static void startConsolePrinter(){
        System.out.println("Type number of command to execute");
        printCommandsList();
    }

    public static void printCommandsList(){
        System.out.println(COMMANDS_LIST);
    }

    public static void printExecuteLine(){
        System.out.print(EXECUTE);
    }

    public static void printFleet(Airline airline){
        System.out.println("Airline fleet: ");
        System.out.println(airline.getAllAircraftsInfo());
    }

    public static void printAirlineinfo(Airline airline){
        System.out.println(airline);
    }

    public static void printTotalAmountPassengersSeats(int seats){
        System.out.println("Sum of all passengers seats = " + seats);
    }

    public static void printTotalMaximumWeightCarried(double sum){
        System.out.println("Sum of all maximum weight carried = " + sum + "kg");
    }

    public static void printSortedAirline(Airline airline){
        System.out.println("Airline after sort");
        printAirlineinfo(airline);
        printFleet(airline);
    }

    public static void printFilteredAircrafts(List<Aircraft> filtered){
        if(filtered.size() > 0) {
            System.out.println("Aircrafts according your params:");
            filtered.forEach(System.out::println);
        }else {
            System.out.println("No aircrafts for your filter");
        }
    }

    public static void printWrongValue(){
        System.out.println(ERROR);
    }
}