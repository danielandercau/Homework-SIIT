package ro.siit;

/**
 * Created by Dani on 18-Sep-17.
 * This is the Renault class, used for creating a Renault object, which extends from the ElectricVehicle class.
 */
public class Renault extends ElectricVehicle {

    public Renault(String manufacturer, String vehicleModel, float motorPower, float batteryCapacity, int range, boolean hasFastCharging) {
        super(manufacturer, vehicleModel, motorPower, batteryCapacity, range, hasFastCharging);
    }
}
