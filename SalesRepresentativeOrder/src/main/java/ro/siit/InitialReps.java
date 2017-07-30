package ro.siit;

import static ro.siit.SalesRepresentativeOrder.salesRep;

/**
 * These are the parameters based on which the salesRep objects will be created.
 */
public class InitialReps {
    public static void initialReps(int order, String name, int sales, int quota) {
        salesRep[order] = new SalesRepresentative();
        salesRep[order].name = name;
        salesRep[order].sales = sales;
        salesRep[order].quota = quota;
        salesRep[order].revenue = sales * quota;
    }
}
