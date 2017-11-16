
/**
 * Created by Daniel on 16/11/2017.
 */

public class WorkerThread extends Thread{

    private Pokoj pokoj;
    private final int valuePerKm = 5;
    private int profit = 0;

    public WorkerThread(Pokoj pokoj) {
        this.pokoj = pokoj;
    }

    @Override
    public void run() {
        System.out.println("The package with the id code " + pokoj.getId() + " has departed!");
        int distance = pokoj.getDistanceToTarget();
        try {
            for (int i = 1; i<=distance; i++){
                sleep(1000);
                System.out.println("The package with the ID " + pokoj.getId() + " has travelled " + i + " kilometers");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        profit = valuePerKm * distance;
        System.out.println("The package with the ID: " + pokoj.getId() + " has been delivered and has generated " + profit + "$ worth of profit!");
    }


}
