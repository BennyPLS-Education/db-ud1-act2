package stream.types;

import java.io.*;

public class BufferedStreams {

    public static void readLines(String file) {
        try (var in = new BufferedReader(new FileReader(file))) {
            in.lines().forEach(System.out::println);
        } catch (IOException ignore) {}
    }

    public static void writeLines(String file, String[] lines) {
        try (var out = new BufferedWriter(new FileWriter(file))) {
            for (String line : lines) {
                out.write(line);
                out.newLine();
            }
        } catch (IOException ignore) {}
    }
}
