package ro.siit;

/**
 * Created by Dani on 10-Oct-17.
 */
public class ElectricVehicle {

    private String manufacturer;
    private String vehicleModel;
    private double motorPower;
    private float batteryCapacity;
    private int range;
    private boolean hasFastCharging;
    private float price;
    private int stockNr;
    private boolean isNew;

    public ElectricVehicle(String manufacturer, String vehicleModel, double motorPower, float batteryCapacity, int range, boolean hasFastCharging, float price, int stockNr, boolean isNew) {
        this.manufacturer = manufacturer;
        this.vehicleModel = vehicleModel;
        this.motorPower = motorPower;
        this.batteryCapacity = batteryCapacity;
        this.range = range;
        this.hasFastCharging = hasFastCharging;
        this.price = price;
        this.stockNr = stockNr;
        this.isNew = isNew;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public double getMotorPower() {
        return motorPower;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getRange() {
        return range;
    }

    public boolean isHasFastCharging() {
        return hasFastCharging;
    }

    public float getPrice() {
        return price;
    }

    public int getStockNr() {
        return stockNr;
    }

    public boolean isNew() {
        return isNew;
    }
}
