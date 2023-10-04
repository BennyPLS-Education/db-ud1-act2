package stream.types;

import java.io.*;

public class DataStreams {

    public static void writeArray(String file, double[] data) {
        try (var in = new DataOutputStream(new DataOutputStream(new FileOutputStream(file)))) {
            for (double d : data) {
                in.writeDouble(d);
            }
        } catch (IOException ignore) {}
    }

    public static double[] readArray(String file) {
        try (var out = new DataInputStream(new DataInputStream(new FileInputStream(file)))) {
            double[] data = new double[out.available() / 8];

            for (int i = 0; i < data.length; i++) {
                data[i] = out.readDouble();
            }

            return data;
        } catch (IOException ignore) {}

        return null;
    }
}
