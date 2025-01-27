package by.courses.java.oop.demo;

import by.courses.java.oop.model.aircraft.Aircraft;
import by.courses.java.oop.model.airline.Airline;

import java.io.PrintWriter;
import java.util.List;

public class CommandsPrinter {
    static {
        writer = new PrintWriter(System.out, true);
    }
    private static PrintWriter writer;

    public static void setWriter(PrintWriter writer) {
        CommandsPrinter.writer = writer;
    }

    public static void startConsolePrinter(){
        writer.println("Type number of command to execute");
        printCommandsList();
    }

    public static void printCommandsList(){
        writer.println("Available commands: \n" +
                "1 - print command list\n" +
                "2 - print airline fleet\n" +
                "3 - count total maximum weight carried\n" +
                "4 - count total amount of places in passenger aircrafts\n" +
                "5 - sort by all aircrafts by maximum range\n" +
                "6 - search aircrafts by range and weight carried\n" +
                "7 - search firefighter aircrafts by water volume\n" +
                "8 - close application");
    }

    public static void printExecuteLine(){
        writer.print("Execute method ");
        writer.flush();
    }

    public static void printFleet(Airline airline){
        writer.println("Airline fleet:");
        writer.println(airline.getAllAircraftsInfo());
    }

    public static void printAirlineInfo(Airline airline){
        writer.println(airline);
    }

    public static void printTotalAmountPassengersSeats(int seats){
        writer.println("Sum of all passengers seats = " + seats);
    }

    public static void printTotalMaximumWeightCarried(double sum){
        writer.println("Sum of all maximum weight carried = " + sum + "kg");
    }

    public static void printSortedAirline(Airline airline){
        writer.println("Airline after sort");
        printAirlineInfo(airline);
        printFleet(airline);
    }

    public static void printFilteredAircrafts(List<Aircraft> filtered){
        if(filtered.size() > 0) {
            writer.println("Aircrafts according your params:");
            filtered.forEach(writer::println);
        }else {
            writer.println("No aircrafts for your filter");
        }
    }

    public static void printWrongValue(){
        writer.println("Typed unresolved command");
    }
}