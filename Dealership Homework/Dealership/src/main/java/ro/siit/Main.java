package ro.siit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by Dani on 18-Sep-17.
 */
public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Customer customer = new Customer("Dorel", 40000);

        EVReader eVReader = new EVReader(new BufferedReader(new FileReader("ElectricVehicles.csv")));
        List<ElectricVehicle> vehicleView = eVReader.readVehicles();
        eVReader.close();

        customer.viewAllVehiclesList(vehicleView);

    }
}

