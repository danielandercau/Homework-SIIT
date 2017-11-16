import java.util.Date;

/**
 * Created by Daniel on 15/11/2017.
 */
public class Pokoj {

    private int id;
    private String packageName;
    private String targetLocation;
    private int distanceToTarget;
    private float pokojValue;
    private Date deliveryDate;
    private Product product;

    public void setPokojValue(float pokojValue) {
        this.pokojValue = pokojValue;
    }

    public Pokoj(int id, String packageName, String targetLocation, int distanceToTarget, Date deliveryDate) {
        this.id = id;
        this.packageName = packageName;
        this.targetLocation = targetLocation;
        this.distanceToTarget = distanceToTarget;
        this.deliveryDate = deliveryDate;
    }

    public void addProductToPokoj(Product[] products) {
        for (int i = 0; i < 5; i++) {
           pokojValue += products[i].getValue();
        }
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public int getDistanceToTarget() {
        return distanceToTarget;
    }

    public float getPokojValue() {
        return pokojValue;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "packageName='" + packageName + '\'' +
                ", targetLocation='" + targetLocation + '\'' +
                ", distanceToTarget=" + distanceToTarget +
                ", packageValue=" + pokojValue +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }
}
