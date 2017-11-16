import java.util.Comparator;

/**
 * Created by Daniel on 15/11/2017.
 */
public class LocationComparator implements Comparator<Pokoj> {
    @Override
    public int compare(Pokoj o1, Pokoj o2) {
        return o1.getTargetLocation().compareTo(o2.getTargetLocation());
    }
}