package ro.siit;

import static ro.siit.SalesRepresentativeOrder.salesRep;

/**
 * This is the bubblesort() algorithm.
 * It sorts the values of the SaleRepresentative revenues, and then it also sorts the names of the SalesRepresentatives according to their revenue.
 */

public class BubbleSort {
    public static void bubbleSort() {
        int a, b, t;
        String t2;


        for (a = 1; a < salesRep.length; a++) {
            for (b = salesRep.length - 1; b >= a; b--) {
                if (salesRep[b - 1].revenue < salesRep[b].revenue) {
                    t = salesRep[b - 1].revenue;
                    salesRep[b - 1].revenue = salesRep[b].revenue;
                    salesRep[b].revenue = t;

                    t2 = salesRep[b - 1].name;
                    salesRep[b - 1].name = salesRep[b].name;
                    salesRep[b].name = t2;
                }
            }
        }
    }
}
