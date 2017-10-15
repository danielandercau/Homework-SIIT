package ro.siit;

/**
 * Created by Dani on 18-Sep-17.
 * This class represents the Bmw model.
 */
public class Bmw extends ElectricVehicle {

    private String bmwSpecificThing;

    public Bmw(String manufacturer, String vehicleModel, double motorPower, float batteryCapacity, int range, boolean hasFastCharging, boolean isNew, float price, int stockNr, String bmwSpecificThing) {
        super(manufacturer, vehicleModel, motorPower, batteryCapacity, range, hasFastCharging, isNew, price, stockNr);
        this.bmwSpecificThing = bmwSpecificThing;
    }

    public String getBmwSpecificThing() {
        return bmwSpecificThing;
    }

    public void setBmwSpecificThing(String bmwSpecificThing) {
        this.bmwSpecificThing = bmwSpecificThing;


    }
}
