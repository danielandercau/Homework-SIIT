package ro.siit;

import static ro.siit.SalesRepresentativeOrder.allSalesReps;

/**
 * Created by Dani on 09-Aug-17.
 */
public class GetArray {

    public static void getArray() {
        System.out.println();
        for (int i = 0; i < allSalesReps.length; i++)
            System.out.println(allSalesReps[i].name + " - $" + allSalesReps[i].revenue);
        System.out.println();
    }
}
