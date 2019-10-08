package by.courses.java.oop.model.airline;

import by.courses.java.oop.model.aircraft.Aircraft;
import java.util.List;

public class Airline {
    public enum PricingPolicy{LOW_COST, SEMI_LOW_COST, NORMAL, PREMIUM}

    private String companyName;
    private PricingPolicy pricingPolicy;
    private List<Aircraft> aircraftFleet;

    public Airline(String companyName, PricingPolicy pricingPolicy, List<Aircraft> aircraftFleet) {
        this.companyName = companyName;
        this.pricingPolicy = pricingPolicy;
        this.aircraftFleet = aircraftFleet;
    }
}
