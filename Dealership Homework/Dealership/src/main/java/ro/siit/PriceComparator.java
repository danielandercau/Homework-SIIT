package ro.siit;

import java.util.Comparator;

/**
 * Created by Dani on 08-Oct-17.
 * This is a custom comparator that is used by the Collections.sort method to sort the vehicles by price.
 */
public class PriceComparator implements Comparator<ElectricVehicle> {

    @Override
    public int compare(ElectricVehicle o1, ElectricVehicle o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}

