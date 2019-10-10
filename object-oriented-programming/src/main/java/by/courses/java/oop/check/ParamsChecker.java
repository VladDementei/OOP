package by.courses.java.oop.check;

import by.courses.java.oop.model.aircraft.Aircraft;

public interface ParamsChecker {
    boolean isSatisfyParams(Aircraft obj, Aircraft lowerBounds, Aircraft upperBounds);
}
