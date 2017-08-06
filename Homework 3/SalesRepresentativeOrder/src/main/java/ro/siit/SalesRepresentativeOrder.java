package ro.siit;

import static ro.siit.DeptsReps.*;
import static ro.siit.BubbleSort.getBubbleSort;
import static ro.siit.BestSalesRepresentative.getBestSalesRep;
import static ro.siit.CompanyRevenue.getCompanyRevenue;
import static ro.siit.BestDept.*;

/**
 * Created by Dani on 29-Jul-17.
 * This program uses a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order.
 * It also displays the most efficient sales representative along with the most efficient department's revenue and the company's total revenue.
 */

public class SalesRepresentativeOrder {
    static SalesRepresentative[] allSalesReps = new SalesRepresentative[20];
    static SalesDepartments[] deptOneReps = new SalesDepartments[5];
    static SalesDepartments[] deptTwoReps = new SalesDepartments[5];
    static SalesDepartments[] deptThreeReps = new SalesDepartments[5];
    static SalesDepartments[] deptFourReps = new SalesDepartments[5];

    public static void main(String[] args) {

        allReps(0, "Costel", 11, 175);
        allReps(1, "Cornel", 8, 220);
        allReps(2, "Dorel", 5, 100);
        allReps(3, "Gigel", 12, 165);
        allReps(4, "Sandel", 2, 150);

        allReps(5, "Radu", 14, 129);
        allReps(6, "Sadu", 11, 119);
        allReps(7, "Dadu", 20, 99);
        allReps(8, "Zadu", 3, 300);
        allReps(9, "Badu", 25, 59);

        allReps(10, "Vali", 22, 119);
        allReps(11, "Dani", 30, 99);
        allReps(12, "Casi", 2, 600);
        allReps(13, "Sani", 50, 49);
        allReps(14, "Lili", 42, 59);

        allReps(15, "Ana", 60, 29);
        allReps(16, "Magda", 75, 19);
        allReps(17, "Simona", 30, 98);
        allReps(18, "Caramba", 1, 1000);
        allReps(19, "Ildiko", 100, 12);


        deptOneReps(0, "Costel", 11, 175);
        deptOneReps(1, "Cornel", 8, 220);
        deptOneReps(2, "Dorel", 5, 100);
        deptOneReps(3, "Gigel", 12, 165);
        deptOneReps(4, "Sandel", 2, 150);

        deptTwoReps(0, "Radu", 14, 129);
        deptTwoReps(1, "Sadu", 11, 119);
        deptTwoReps(2, "Dadu", 20, 99);
        deptTwoReps(3, "Zadu", 3, 300);
        deptTwoReps(4, "Badu", 25, 59);

        deptThreeReps(0, "Vali", 22, 119);
        deptThreeReps(1, "Dani", 30, 99);
        deptThreeReps(2, "Casi", 2, 600);
        deptThreeReps(3, "Sani", 50, 49);
        deptThreeReps(4, "Lili", 42, 59);

        deptFourReps(0, "Ana", 60, 29);
        deptFourReps(1, "Magda", 75, 19);
        deptFourReps(2, "Simona", 30, 98);
        deptFourReps(3, "Caramba", 1, 1000);
        deptFourReps(4, "Ildiko", 100, 12);


        /**
         * Here we display the unsorted array on the console.
         */

        System.out.println("The unsorted array is: ");
        System.out.println();
        for (int i = 0; i < allSalesReps.length; i++)
            System.out.println(allSalesReps[i].name + " - $" + allSalesReps[i].revenue);
        System.out.println();

        /**
         * Here we call for the method bubbleSort() which is located in the BubbleSort.java file.
         */

        getBubbleSort();

        /**
         * Here we display the sorted array on the console
         */

        System.out.println("The sorted array is:");
        System.out.println();
        for (int i = 0; i < allSalesReps.length; i++)
            System.out.println(allSalesReps[i].name + " - $" + allSalesReps[i].revenue);
        System.out.println();


        /**
         * The following three blocks of code display the best sales representative, the best department's revenue, and the company's total revenue.
         */

        SalesRepresentative bestSaleRep = getBestSalesRep();
        System.out.println("The best sales representative is " + bestSaleRep.name + " and he has generated $" + bestSaleRep.revenue + " worth of revenue!");

        System.out.println();

        SalesRepresentative companyRevenue = getCompanyRevenue();
        System.out.println("The company has generated $" + companyRevenue.revenue + " worth of revenue!");

        System.out.println();
        SalesRepresentative bestDept = getBestDept();
        System.out.println("The best department has generated $" + bestDept.revenue + " worth of revenue");


    }
}


