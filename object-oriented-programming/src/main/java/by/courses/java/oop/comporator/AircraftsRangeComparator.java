package by.courses.java.oop.comporator;

import by.courses.java.oop.model.aircraft.Aircraft;
import java.util.Comparator;

public class AircraftsRangeComparator implements Comparator<Aircraft> {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getMaxFlightRangeKM() - o2.getMaxFlightRangeKM();
    }
}