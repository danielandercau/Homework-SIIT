package ro.siit;

/**
 * Created by Dani on 18-Sep-17.
 * This is the Bmw class, used for creating a Bmw object, which extends from the ElectricVehicle class.
 */
public class Bmw extends ElectricVehicle {

    public Bmw(String manufacturer, String vehicleModel, float motorPower, float batteryCapacity, int range, boolean hasFastCharging, String bmwSpecificThing) {
        super(manufacturer, vehicleModel, motorPower, batteryCapacity, range, hasFastCharging);
        this.bmwSpecificThing = bmwSpecificThing;


    }

    private String bmwSpecificThing;

    public String getBmwSpecificThing() {
        return bmwSpecificThing;
    }

    public void setBmwSpecificThing(String bmwSpecificThing) {
        this.bmwSpecificThing = bmwSpecificThing;


    }
}
