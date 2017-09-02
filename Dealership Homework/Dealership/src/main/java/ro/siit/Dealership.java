package ro.siit;

/**
 * Created by Dani on 25-Aug-17.
 */
public class Dealership {

    private String dealershipName = "Get Electric";
    private int vehicleId;
    private double price;
    private int stockNo;

    public String getDealershipName() {
        return dealershipName;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockNo() {
        return stockNo;
    }

    public void setStockNo(int stockNo) {
        this.stockNo = stockNo;
    }
}

