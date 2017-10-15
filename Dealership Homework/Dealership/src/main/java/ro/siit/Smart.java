package ro.siit;

/**
 * Created by Dani on 18-Sep-17.
 * This class represents the Smart model
 */
public class Smart extends ElectricVehicle {
    public Smart(String manufacturer, String vehicleModel, double motorPower, float batteryCapacity, int range, boolean hasFastCharging, boolean isNew, float price, int stockNr) {
        super(manufacturer, vehicleModel, motorPower, batteryCapacity, range, hasFastCharging, isNew, price, stockNr);
    }
}
