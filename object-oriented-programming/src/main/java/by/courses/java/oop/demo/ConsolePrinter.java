package by.courses.java.oop.demo;

public class ConsolePrinter {

    static {
        COMMANDS_LIST = "Available commands: \n" +
                "1 - print info about airline\n" +
                "2 - count total maximum weight carried\n" +
                "3 - count total amount of places in passenger aircrafts\n" +
                "4 - sort by all aircrafts by maximum range\n" +
                "5 - search aircrafts\n" +
                "6 - close application";
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

    public static void printWrongValue(){
        System.out.println(ERROR);
    }
}