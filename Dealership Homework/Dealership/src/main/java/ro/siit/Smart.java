package ro.siit;

/**
 * Created by Dani on 10-Oct-17.
 */
public class Smart extends ElectricVehicle{

    public Smart(String manufacturer, String vehicleModel, double motorPower, float batteryCapacity, int range, boolean hasFastCharging, float price, int stockNr, boolean isNew) {
        super(manufacturer, vehicleModel, motorPower, batteryCapacity, range, hasFastCharging, price, stockNr, isNew);
    }
}
