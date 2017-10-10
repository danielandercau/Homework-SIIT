package ro.siit;

/**
 * Created by Dani on 18-Sep-17.
 * This is the Kia class, used for creating a Kia object, which extends from the ElectricVehicle class.
 */
public class Kia extends ElectricVehicle {

    public Kia(String manufacturer, String vehicleModel, float motorPower, float batteryCapacity, int range, boolean hasFastCharging) {
        super(manufacturer, vehicleModel, motorPower, batteryCapacity, range, hasFastCharging);
    }
}
