package ro.siit;

import static ro.siit.SalesRepresentativeOrder.allSalesReps;

/**
 * Created by Dani on 05-Aug-17.
 * This method returns the total revenue generated by the company
 */
public class CompanyRevenue {

    public static SalesRepresentative getCompanyRevenue() {
        SalesRepresentative companyRevenue = new SalesRepresentative();
        companyRevenue.revenue = 0;
        for (SalesRepresentative company : allSalesReps) {
            companyRevenue.revenue = companyRevenue.revenue + company.revenue;
        }
        return companyRevenue;
    }
}