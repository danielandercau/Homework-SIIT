package ro.siit;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Dani on 12-Oct-17.
 * This class represents a writer, and in this particular program it is used to overwrite the GreenBonusProgramFunds.csv file so that the funds are up to date if a GBP purchase is made.
 */
public class GBPWriter extends Writer {

    private BufferedWriter writer;

    public GBPWriter(BufferedWriter writer) {
        this.writer = writer;
    }

    /**
     * This method overwrites the GreenBonusProgramFunds.csv file.
     * @param p = The float received to be generated into a .csv file.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void writeFunds(float p) throws IOException, ClassNotFoundException {
        String serializedFunds = String.valueOf(p);
        try {
            writer.write(serializedFunds);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

    }

    @Override
    public void flush() throws IOException {
        writer.flush();
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }
}
