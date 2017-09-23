package ro.siit;

import static ro.siit.SalesRepresentativeOrder.allSalesReps;

/**
 * Created by Dani on 05-Aug-17.
 * This method returns the best sales representative from the entire company.
 */
public class BestSalesRepresentative {

    public static SalesRepresentative getBestSalesRep() {
        SalesRepresentative bestSalesRep = new SalesRepresentative();
        bestSalesRep.revenue = 0;
        for (SalesRepresentative representative : allSalesReps) {
            if (representative.revenue > bestSalesRep.revenue) {
                bestSalesRep = representative;
            }
        }
        return bestSalesRep;
    }
}
