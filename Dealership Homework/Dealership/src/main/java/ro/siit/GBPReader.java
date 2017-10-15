package ro.siit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Dani on 12-Oct-17.
 * This class represents a reader for the Green Bonus program funds.
 */
public class GBPReader extends Reader{

    private BufferedReader reader;

    public GBPReader(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    /**
     * This method reads the funds from the GreenBonusProgramFunds.csv.
     * @return = Returns the funds.
     */
    public float readGBPFunds() {
        try {
            String line = reader.readLine();
            float funds = 0;
            while (line != null) {
                String[] tokens = line.split(",");
                float money = Float.parseFloat(tokens[0]);
                funds += money;
                line = reader.readLine();
            }
            return funds;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}
