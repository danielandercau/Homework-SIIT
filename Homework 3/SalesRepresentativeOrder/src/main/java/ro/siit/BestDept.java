package ro.siit;

import static ro.siit.SalesRepresentativeOrder.*;

/**
 * Created by Dani on 05-Aug-17.
 * This method returns every department's revenue and uses the four returned values to compute the best department's revenue and name.
 */
public class BestDept {


    public static SalesRepresentative getDeptOneRev() {
        SalesRepresentative deptOneRevenue = new SalesRepresentative();
        deptOneRevenue.name = "Department One";
        deptOneRevenue.revenue = 0;
        for (SalesDepartments deptOne : deptOneReps) {
            deptOneRevenue.revenue = deptOneRevenue.revenue + deptOne.revenue;
        }
        return deptOneRevenue;
    }

    public static SalesRepresentative getDeptTwoRev() {
        SalesRepresentative deptTwoRevenue = new SalesRepresentative();
        deptTwoRevenue.name = "Department Two";
        deptTwoRevenue.revenue = 0;
        for (SalesDepartments deptTwo : deptTwoReps) {
            deptTwoRevenue.revenue = deptTwoRevenue.revenue + deptTwo.revenue;
        }
        return deptTwoRevenue;
    }

    public static SalesRepresentative getDeptThreeRev() {
        SalesRepresentative deptThreeRevenue = new SalesRepresentative();
        deptThreeRevenue.name = "Department Three";
        deptThreeRevenue.revenue = 0;
        for (SalesDepartments deptThree : deptThreeReps) {
            deptThreeRevenue.revenue = deptThreeRevenue.revenue + deptThree.revenue;
        }
        return deptThreeRevenue;
    }

    public static SalesRepresentative getDeptFourRev() {
        SalesRepresentative deptFourRevenue = new SalesRepresentative();
        deptFourRevenue.name = "Department Four";
        deptFourRevenue.revenue = 0;
        for (SalesDepartments deptFour : deptFourReps) {
            deptFourRevenue.revenue = deptFourRevenue.revenue + deptFour.revenue;
        }
        return deptFourRevenue;
    }

    public static SalesRepresentative getBestDept() {
        SalesRepresentative bestDept = new SalesRepresentative();
        SalesRepresentative deptOneRev = getDeptOneRev();
        SalesRepresentative deptTwoRev = getDeptTwoRev();
        SalesRepresentative deptThreeRev = getDeptThreeRev();
        SalesRepresentative deptFourRev = getDeptFourRev();

        getBestDeptNameRev(bestDept, deptOneRev);
        getBestDeptNameRev(bestDept, deptTwoRev);
        getBestDeptNameRev(bestDept, deptThreeRev);
        getBestDeptNameRev(bestDept, deptFourRev);

        return bestDept;
    }

    private static void getBestDeptNameRev(SalesRepresentative bestDept, SalesRepresentative deptOneRev) {
        if (deptOneRev.revenue > bestDept.revenue) {
            bestDept.revenue = deptOneRev.revenue;
            bestDept.name = deptOneRev.name;
        }
    }
}
