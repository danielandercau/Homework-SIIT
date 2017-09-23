package ro.siit;

/**
 * Created by Dani on 25-Aug-17.
 */
public class GreenBonusProgram {

    private long programBudget;
    private String[] purchaseHistory;

    public long getProgramBudget() {
        return programBudget;
    }

    public void setProgramBudget(long programBudget) {
        this.programBudget = programBudget;
    }

    public String[] getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(String[] purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
}
