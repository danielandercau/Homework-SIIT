package ro.siit;

import java.io.*;

/**
 * Created by Dani on 26-Sep-17.
 * This class represents the Green Bonus Program model.
 */
public class GreenBonusProgram {


    private float funds;

    /**
     * This method is a custom getter for the funds floating-point-number, as it directly reads the funds from the GreenBonusProgramFunds.csv
     * @return = The funds stored in the GreenBonusProgramFunds.csv
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public float getFunds() throws IOException, ClassNotFoundException {
        GBPReader gbpReader = new GBPReader(new BufferedReader(new FileReader("GreenBonusProgramFunds.csv")));
        funds = gbpReader.readGBPFunds();
        gbpReader.close();
        return funds;
    }

    /**
     * This method checks if the Green Bonus Program has enough funds for the customer to receive them.
     * @return = True if it has enough funds, False if it doesn't have enough funds.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean checkFunds() throws IOException, ClassNotFoundException {
        funds = getFunds();
        if ((funds - 10000) >= 0) {
            return true;
        } else return false;
    }

    /**
     * This method subtracts the funds that the customer receives from the Green Bonus Program.
     * More importantly, this method ensures that whenever the customer receives the funds from the GBP, the funds in the .csv file are updated. This happens by overwriting the .csv file.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void subtractFunds() throws IOException, ClassNotFoundException {
        funds -= 10000;
        GBPWriter gbpWriter = new GBPWriter(new BufferedWriter(new FileWriter("GreenBonusProgramFunds.csv")));
        gbpWriter.writeFunds(funds);
        gbpWriter.flush();
        gbpWriter.close();
    }

    /**
     * TEST ONLY METHOD.
     * This method is only used for tests, so that effective tests can be made on mocked funds from the GBP.
     * @param funds
     */
    public void setFunds(float funds) {
        this.funds = funds;
    }

    /**
     * TEST ONLY METHOD.
     * This method is a custom getter that is only used in tests, so that effective tests can be made on mocked funds from the GBP.
     * @return = The MOCKED funds in the test class.
     */
    public float getFundsForTest() {
        return funds;
    }

    /**
     * TEST ONLY METHOD.
     * This method is only used for tests, so that effective tests can be made on mocked funds from the GBP.
     * It is similar to the checkFunds() method, it checks if the MOCKED Green Bonus Program has enough funds for the customer to receive them.
     * @return = True if it has enough funds, False if it doesn't have enough funds.
     */
    public boolean checkFundsForTest() {
        funds = getFundsForTest();
        return (funds - 10000) >= 0;
    }
}
