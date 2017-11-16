import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Daniel on 15/11/2017.
 */
public class Company {

    private int valuePerKm = 5;
    private int totalProfit;
    private int marocProfit;
    private int numberOfPokojes;
    private int totalProductValue;


    public void doYourMagic() throws InterruptedException {

        LocationComparator locationComparator = new LocationComparator();
        DateComparator dateComparator = new DateComparator();
        Scanner s = new Scanner(System.in);
        String answer;

        List<Pokoj> pokojList = new ArrayList<>();

        Pokoj pokoj0 = new Pokoj(1, "Package1", "Pakistan", 12, new Date(2017, 05, 05));
        Pokoj pokoj1 = new Pokoj(2, "Package2", "Congo", 13, new Date(2017, 05, 07));
        Pokoj pokoj2 = new Pokoj(3, "Package3", "Maroc", 14, new Date(2017, 05, 06));
        Pokoj pokoj3 = new Pokoj(4, "Package4", "Maroc", 15, new Date(2017, 05, 06));
        Pokoj pokoj4 = new Pokoj(5, "Package5", "Singapore", 16, new Date(2017, 05, 03));
        Pokoj pokoj5 = new Pokoj(6, "Package6", "Olanda", 17, new Date(2017, 05, 13));
        Pokoj pokoj6 = new Pokoj(7, "Package7", "Romania", 18, new Date(2017, 05, 23));

        pokojList.add(pokoj0);
        pokojList.add(pokoj1);
        pokojList.add(pokoj2);
        pokojList.add(pokoj3);
        pokojList.add(pokoj4);
        pokojList.add(pokoj5);
        pokojList.add(pokoj6);

        Product ceapa = new Product(20);
        Product ficat = new Product(50);
        Product copita = new Product(60);
        Product ciorba = new Product(10);
        Product laptop = new Product(200);
        Product chestie = new Product(60);
        Product pipota = new Product(25);
        Product altachestie = new Product(40);

        System.out.println("Do you want to sort the packages? y/n");
        answer = s.next();
        if (answer.equals("y")) {
            System.out.println("Input the sorting attribute: ");
            System.out.println("l = Location, d = Delivery Date");
            answer = s.next();
            if (answer.equals("l")) {
                Collections.sort(pokojList, locationComparator);
                for (Pokoj p : pokojList) {
                    System.out.println(p);
                }
            } else if (answer.equals("d")) {
                Collections.sort(pokojList, dateComparator);
                for (Pokoj p : pokojList) {
                    System.out.println(p);
                }
            } else throw new IllegalArgumentException("Only \"l\" or \"d\" answers can be used");
        } else if (answer.equals("n")) {
        } else throw new IllegalArgumentException("Only \"y\" or \"n\" answers can be used");

        pokoj0.addProductToPokoj(new Product[]{ceapa, pipota, chestie, altachestie, ficat});
        pokoj1.addProductToPokoj(new Product[]{copita, ciorba, laptop, pipota, chestie});
        pokoj2.addProductToPokoj(new Product[]{chestie, altachestie, ciorba, ficat, ceapa});
        pokoj3.addProductToPokoj(new Product[]{ficat, laptop, pipota, chestie, altachestie});
        pokoj4.addProductToPokoj(new Product[]{ceapa, copita, laptop, ficat, pipota});
        pokoj5.addProductToPokoj(new Product[]{laptop, chestie, altachestie, pipota, copita});
        pokoj6.addProductToPokoj(new Product[]{ceapa, ficat, ciorba, pipota, copita});


        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < pokojList.size(); i++) {
            WorkerThread workerThread = new WorkerThread(pokojList.get(i));
            executorService.execute(workerThread);
            workerThread.join();
        }
        executorService.shutdown();

        for (Pokoj p : pokojList) {
            totalProfit += p.getDistanceToTarget() * valuePerKm;
            if (p.getTargetLocation().equals("Maroc") && p.getDeliveryDate().equals(new Date(2017, 05, 06))) {
                marocProfit += p.getDistanceToTarget() * valuePerKm;
                numberOfPokojes += 1;
            }
            totalProductValue += p.getPokojValue();
        }

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            System.out.println("At 20.11.2017, " + numberOfPokojes + " packages were shipped to Cluj, resulting in a " + marocProfit + "$ profit.");

            System.out.println("Total generated profit: " + totalProfit + "$ !");
            System.out.println("Total shipped merchandise value " + totalProductValue + "$ !");
        } catch (InterruptedException e) {
            System.err.println("Main thread awaitTermination was interrupted");
        }
    }

}
