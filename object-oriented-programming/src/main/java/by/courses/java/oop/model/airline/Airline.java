package by.courses.java.oop.model.airline;

import by.courses.java.oop.model.aircraft.Aircraft;
import by.courses.java.oop.model.aircraft.PassengerAircraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airline {
    public enum PricingPolicy{LOW_COST, SEMI_LOW_COST, NORMAL, PREMIUM}

    private String companyName;
    private PricingPolicy pricingPolicy;
    private List<Aircraft> aircraftFleet;

    public Airline(String companyName, PricingPolicy pricingPolicy) {
        this(companyName, pricingPolicy, new ArrayList<>());
    }

    public Airline(String companyName, PricingPolicy pricingPolicy, List<Aircraft> aircraftFleet) {
        this.companyName = companyName;
        this.pricingPolicy = pricingPolicy;
        this.aircraftFleet = aircraftFleet;
    }

    public void addAircraft(Aircraft aircraft){
        if(aircraft != null){
            aircraftFleet.add(aircraft);
        }
    }

    public String getAllAircraftsInfo(){
        StringBuffer stringBuffer = new StringBuffer();
        aircraftFleet.forEach(elem -> {
            stringBuffer.append(elem.toString());
            stringBuffer.append("\n");

        });
        return stringBuffer.toString();
    }

    public void sort(Comparator<Aircraft> comparator){
        aircraftFleet.sort(comparator);
    }

    public double countTotalMaximumWeightCarried(){
        return aircraftFleet.stream().mapToDouble(Aircraft::getMaxWeightCarriedKG).sum();
    }

    public int countTotalAmountPassengersSeats(){
        return aircraftFleet.stream().filter(elem -> elem instanceof PassengerAircraft).
                mapToInt(elem -> ((PassengerAircraft)elem).getMaxPassengersCarried()).sum();
    }

    @Override
    public String toString() {
        return "Airline: company name \"" + companyName + "\", pricing policy = " + pricingPolicy +
                ", fleet size = " + aircraftFleet.size() + " aircraft";
    }
}
