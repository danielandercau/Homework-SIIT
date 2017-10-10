import org.junit.Test;
import ro.siit.Customer;
import ro.siit.ElectricVehicle;
import ro.siit.View;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Dani on 18-Sep-17.
 *
 */
public class VehicleFilterTest {


    @Test
    public void noVehiclesWhichAreNotInStockAreDisplayedWhenStockFilterIsUsed() {

        List<View> testElectricVehicleList = new ArrayList<>();

        testElectricVehicleList.add(new View("Dacia", "1300", 40, 59, 244, false, 300, 1));
        testElectricVehicleList.add(new View("Oltcit", "Club", 40, 24, 232, true, 400, 0));
        testElectricVehicleList.add(new View("Lada", "Niva", 44, 23, 444, true, 340, 1));

        Customer c = new Customer();

        for (View v : c.getVehiclesInStockList(testElectricVehicleList)) {
            assertNotEquals(0, v.getStockNr());
        }
    }

    @Test
    public void noVehiclesWhichDoNotHaveFastChargingAreDisplayedWhenFastChargingFilterIsUsed() {

        List<View> testElectricVehicleList = new ArrayList<>();

        testElectricVehicleList.add(new View("Dacia", "1300", 40, 59, 244, false, 300, 1));
        testElectricVehicleList.add(new View("Oltcit", "Club", 40, 24, 232, true, 400, 0));
        testElectricVehicleList.add(new View("Lada", "Niva", 44, 23, 444, true, 340, 1));

        Customer c = new Customer();

        for (View v : c.getFastChargingList(testElectricVehicleList)) {
            assertNotEquals(0, v.isHasFastCharging());
        }
    }
}


