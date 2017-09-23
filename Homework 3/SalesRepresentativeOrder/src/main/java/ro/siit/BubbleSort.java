package ro.siit;

import static ro.siit.SalesRepresentativeOrder.allSalesReps;

/**
 * This is the bubblesort() algorithm.
 * It sorts the values of the SaleRepresentative revenues, and then it also sorts the names of the SalesRepresentatives according to their revenue.
 */

public class BubbleSort {
    public static void getBubbleSort() {
        int a, b, t;
        String t2;


        for (a = 1; a < allSalesReps.length; a++) {
            for (b = allSalesReps.length - 1; b >= a; b--) {
                if (allSalesReps[b - 1].revenue < allSalesReps[b].revenue) {
                    t = allSalesReps[b - 1].revenue;
                    allSalesReps[b - 1].revenue = allSalesReps[b].revenue;
                    allSalesReps[b].revenue = t;

                    t2 = allSalesReps[b - 1].name;
                    allSalesReps[b - 1].name = allSalesReps[b].name;
                    allSalesReps[b].name = t2;
                }
            }
        }
    }
}
