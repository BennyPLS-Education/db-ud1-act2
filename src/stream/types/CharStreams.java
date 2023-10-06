package stream.types;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreams {

    public static void readChars(String file) {
        try (var in = new FileReader(file)) {
            int b;
            while ((b = in.read()) != -1) {
                System.out.print((char) b);
            }

        } catch (IOException ignore) {}
    }

    public static void ussless(String file) {
        try (var in = new FileReader(file)) {
            int b;
            while ((b = in.read()) != -1);

        } catch (IOException ignore) {}
    }

    public static void writeChars(String file, char[] data) {
        try (var out = new FileWriter(file)) {
            out.write(data);
        } catch (IOException ignore) {}
    }
}
