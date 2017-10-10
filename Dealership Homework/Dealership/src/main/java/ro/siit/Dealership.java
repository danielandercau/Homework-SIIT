package ro.siit;

/**
 * Created by Dani on 18-Sep-17.
 * This class respresents the Dealership model.
 */
public class Dealership {

    private String dealershipName = "Get Electric";

    private int price;
    private int stockNr;


    public Dealership(int price, int stockNr) {
        this.price = price;
        this.stockNr = stockNr;
    }

    private Customer[] customers;
    private ElectricVehicle[] electricVehicle;




    public String getDealershipName() {
        return dealershipName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public int getStockNr() {
        return stockNr;
    }

    public void setStockNr(int stockNr) {
        this.stockNr = stockNr;
    }

}
