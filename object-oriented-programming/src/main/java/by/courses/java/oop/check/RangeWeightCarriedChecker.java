package by.courses.java.oop.check;

import by.courses.java.oop.model.aircraft.Aircraft;

public class RangeWeightCarriedChecker implements ParamsChecker {
    @Override
    public boolean isSatisfyParams(Aircraft obj, Aircraft lowerBounds, Aircraft upperBounds) {
        return (( obj.getMaxFlightRangeKM() <= upperBounds.getMaxFlightRangeKM() ) &&
                ( obj.getMaxFlightRangeKM() >= lowerBounds.getMaxFlightRangeKM() ) &&
                ( obj.getMaxWeightCarriedKG() <= upperBounds.getMaxWeightCarriedKG() ) &&
                ( obj.getMaxWeightCarriedKG() >= lowerBounds.getMaxWeightCarriedKG() ));
    }
}