package ro.siit;

/**
 * Created by Dani on 10-Oct-17.
 */
public class Renault extends ElectricVehicle{

    public Renault(String manufacturer, String vehicleModel, double motorPower, float batteryCapacity, int range, boolean hasFastCharging, float price, int stockNr, boolean isNew) {
        super(manufacturer, vehicleModel, motorPower, batteryCapacity, range, hasFastCharging, price, stockNr, isNew);
    }
}
