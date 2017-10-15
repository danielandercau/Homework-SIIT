package ro.siit;

import java.util.Comparator;

/**
 * Created by Dani on 09-Oct-17.
 * This is a custom comparator that is used by the Collections.sort method to sort the vehicles by range.
 */
public class RangeComparator implements Comparator<ElectricVehicle> {
    @Override
    public int compare(ElectricVehicle o1, ElectricVehicle o2) {
        return o1.getRange() - o2.getRange();
    }
}
