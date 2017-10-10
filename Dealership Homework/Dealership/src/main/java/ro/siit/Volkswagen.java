package ro.siit;

/**
 * Created by Dani on 18-Sep-17.
 * This is the Volkswagen class, used for creating a Volkswagen object, which extends from the ElectricVehicle class.
 */
public class Volkswagen extends ElectricVehicle{
    public Volkswagen(String manufacturer, String vehicleModel, float motorPower, float batteryCapacity, int range, boolean hasFastCharging) {
        super(manufacturer, vehicleModel, motorPower, batteryCapacity, range, hasFastCharging);
    }
}
