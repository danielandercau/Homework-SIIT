package ro.siit;

import static ro.siit.BubbleSort.bubbleSort;
import static ro.siit.InitialReps.initialReps;

/**
 * Created by Dani on 29-Jul-17.
 * This program uses a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order.
 */

public class SalesRepresentativeOrder {
    static SalesRepresentative[] salesRep = new SalesRepresentative[4];

    public static void main(String[] args) {

        initialReps(0, "Costel", 11, 175);
        initialReps(1, "Cornel", 8, 220);
        initialReps(2, "Dorel", 5, 100);
        initialReps(3, "Gigel", 12, 165);

        /**
         * Here we display the unsorted array on the console.
         */

        System.out.println("The unsorted array is: ");
        for (int i = 0; i < 4; i++)
            System.out.println(salesRep[i].name + " has a revenue of: " + salesRep[i].revenue);
        System.out.println();

        /**
         * Here we call for the method bubbleSort() which is located in the BubbleSort.java file.
         */

        bubbleSort();

        /**
         * Here we display the unsorted array on the console
         */

        System.out.println("The sorted array is:");
        for (int i = 0; i < salesRep.length; i++)
            System.out.println(salesRep[i].name + " has a revenue of: " + salesRep[i].revenue);
        System.out.println();

    }
}


