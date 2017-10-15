package ro.siit;

import java.io.IOException;
import java.util.*;

/**
 * Created by Dani on 18-Sep-17.
 * This class represents the Dealership model.
 */
public class Dealership {

    GreenBonusProgram g = new GreenBonusProgram();

    private String dealershipName = "Get Electric";

    public String getDealershipName() {
        return dealershipName;
    }

    /**
     * This method checks if the car is in stock.
     * @param v = The Electric Vehicle to be checked.
     * @return = Returns true if the vehicle is in stock and false if it isn't.
     */
    public boolean checkIfCarIsInStock(ElectricVehicle v) {
        return v.getStockNr() > 0 ? true : false;
    }

    /**
     * This method checks if the vehicle is new so that the dealership can grant the Green Bonus Program funds.
     * @param electricVehicle = The vehicle to be checked.
     * @return = True if the vehicle is new, False if the vehicle is not new.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean checkIfDealershipCanGrantFunds(ElectricVehicle electricVehicle) throws IOException, ClassNotFoundException {
        if (electricVehicle.isNew()) {
            g.checkFunds();
            return true;
        } else {
            System.out.println("The Green Bonus Program cannot grant you funds since the vehicle is not new.");
            return false;
        }
    }
}
