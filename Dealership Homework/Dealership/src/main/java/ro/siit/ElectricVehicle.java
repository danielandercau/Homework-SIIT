package ro.siit;

/**
 * Created by Dani on 25-Aug-17.
 */
public class ElectricVehicle extends Manufacturer {

    private String vehicleModel;
    private float motorPower;
    private float batteryCapacity;
    private int energyConsumption;
    private boolean isNew;
    private int productionYear;

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public float getMotorPower() {
        return motorPower;
    }

    public void setMotorPower(float motorPower) {
        this.motorPower = motorPower;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
