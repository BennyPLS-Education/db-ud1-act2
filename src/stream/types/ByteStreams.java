package stream.types;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
    public static void readBytes(String file) {
        try (var in = new FileInputStream(file)) {
            int b;
            while ((b = in.read()) != -1) {
                System.out.print((char) b);
            }

        } catch (IOException ignore) {}
    }

    public static void writeBytes(String file, byte[] data) {
        try (var out = new FileOutputStream(file)) {
            out.write(data);
        } catch (IOException ignore) {}
    }

}
