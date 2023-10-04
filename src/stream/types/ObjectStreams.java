package stream.types;

import java.io.*;

public class ObjectStreams {

    public static void writeObject(String filename, Init object) {
        try (var in = new ObjectOutputStream(new FileOutputStream(filename))) {
            in.writeObject(object);
        } catch (IOException ignore) {}
    }

    public static Init readObject(String filename) {
        try (var in = new ObjectInputStream(new FileInputStream(filename))) {
            return (Init) in.readObject();
        } catch (ClassNotFoundException | IOException ignored) { }

        return null;
    }
}

