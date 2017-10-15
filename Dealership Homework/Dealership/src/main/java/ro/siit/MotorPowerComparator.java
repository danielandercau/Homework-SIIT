package ro.siit;

import java.util.Comparator;

/**
 * Created by Dani on 09-Oct-17.
 * This is a custom comparator that is used by the Collections.sort method to sort the vehicles by motor power.
 */
public class MotorPowerComparator implements Comparator<ElectricVehicle> {
    @Override
    public int compare(ElectricVehicle o1, ElectricVehicle o2) {
        return (int) (o1.getMotorPower() - o2.getMotorPower());
    }
}
