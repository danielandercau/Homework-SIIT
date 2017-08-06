package ro.siit;

import static ro.siit.SalesRepresentativeOrder.*;

/**
 * These are the parameters based on which the allSalesReps, deptOneReps, deptTwoReps, deptThreeReps and deptFourReps objects will be created.
 */
public class DeptsReps {

    public static void allReps(int order, String name, int sales, int quota) {
        allSalesReps[order] = new SalesRepresentative();
        allSalesReps[order].name = name;
        allSalesReps[order].sales = sales;
        allSalesReps[order].quota = quota;
        allSalesReps[order].revenue = sales * quota;
    }

    public static void deptOneReps(int order, String name, int sales, int quota) {
        deptOneReps[order] = new SalesDepartments();
        deptOneReps[order].name = name;
        deptOneReps[order].sales = sales;
        deptOneReps[order].quota = quota;
        deptOneReps[order].revenue = sales * quota;
    }

    public static void deptTwoReps(int order, String name, int sales, int quota) {
        deptTwoReps[order] = new SalesDepartments();
        deptTwoReps[order].name = name;
        deptTwoReps[order].sales = sales;
        deptTwoReps[order].quota = quota;
        deptTwoReps[order].revenue = sales * quota;
    }

    public static void deptThreeReps(int order, String name, int sales, int quota) {
        deptThreeReps[order] = new SalesDepartments();
        deptThreeReps[order].name = name;
        deptThreeReps[order].sales = sales;
        deptThreeReps[order].quota = quota;
        deptThreeReps[order].revenue = sales * quota;
    }

    public static void deptFourReps(int order, String name, int sales, int quota) {
        deptFourReps[order] = new SalesDepartments();
        deptFourReps[order].name = name;
        deptFourReps[order].sales = sales;
        deptFourReps[order].quota = quota;
        deptFourReps[order].revenue = sales * quota;
    }
}
