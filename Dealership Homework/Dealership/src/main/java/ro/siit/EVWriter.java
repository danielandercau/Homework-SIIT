package ro.siit;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Dani on 09-Oct-17.
 * This class represents a writer, and in this particular program it is used to overwrite the ElectricVehicles.csv file so that the stock number of the vehicles is up to date if a purchase is made.
 */
public class EVWriter extends Writer {

    private BufferedWriter writer;

    public EVWriter(BufferedWriter writer) {
        this.writer = writer;
    }

    /**
     * This method overwrites the ElectricVehicles.csv file.
     * @param v = The list received to be generated into a .csv file.
     */
    public void writeVehicles(ElectricVehicle v) {
        String serializedVehicle = v.getManufacturer() + "," + v.getVehicleModel() + "," + v.getMotorPower() + "," +
                v.getBatteryCapacity() + "," + v.getRange() + "," + v.isHasFastCharging() +  "," + v.isNew() +  "," + v.getPrice() + "," + v.getStockNr();
        try {
            writer.write(serializedVehicle);
            writer.newLine();
        } catch (IOException e) {
            // TODO - think about error handling
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
