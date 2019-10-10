package by.courses.java.oop.check;

import by.courses.java.oop.model.aircraft.Aircraft;
import by.courses.java.oop.model.aircraft.FireFighterAircraft;

public class FireFighterWaterVolumeChecker implements ParamsChecker {
    @Override
    public boolean isSatisfyParams(Aircraft obj, Aircraft lowerBounds, Aircraft upperBounds) {
        if(!(obj instanceof FireFighterAircraft) ||
                !(lowerBounds instanceof FireFighterAircraft) || !(upperBounds instanceof FireFighterAircraft)){
            return false;
        }
        return (((FireFighterAircraft) obj).getWaterVolumeM3() >= ((FireFighterAircraft) lowerBounds).getWaterVolumeM3() &&
                ((FireFighterAircraft) obj).getWaterVolumeM3() <= ((FireFighterAircraft) upperBounds).getWaterVolumeM3());
    }
}
