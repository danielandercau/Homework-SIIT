package ro.siit;

/**
 * Created by Dani on 18-Sep-17.
 * This is the Hyundai class, used for creating a Hyundai object, which extends from the ElectricVehicle class.
 */
public class Hyundai extends ElectricVehicle {

    public Hyundai(String manufacturer, String vehicleModel, float motorPower, float batteryCapacity, int range, boolean hasFastCharging) {
        super(manufacturer, vehicleModel, motorPower, batteryCapacity, range, hasFastCharging);
    }
}