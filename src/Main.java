import stream.types.*;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int option;

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Selecciona una activitat:");
        System.out.println("-------------------------");
        System.out.println("0. Sortir");
        System.out.println("1. Exercici 1");
        System.out.println("2. Exercici 2");
        System.out.println("3. Exercici 3");
        System.out.println("4. Exercici 4");
        System.out.println("5. Exercici 5");
        System.out.println("-------------------------");

        option = getNumber();

        switch (option) {
            case 0 -> System.out.println("Adeu!");
            case 1 -> testBytes();
            case 2 -> testChars();
            case 3 -> testBuffered();
            case 4 -> testData();
            case 5 -> testObject();

            default -> System.out.println("Opció no vàlida");
        }

        if (option != 0) main(args);
    }

    /**
     * Retrieves an integer number entered by the user.
     *
     * @return The integer number entered by the user.
     */
    private static int getNumber() {
        var input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Opció: ");
                return input.nextInt();
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("Introdueix un número vàlid");
            }
        }
    }

    static void testBytes() {
        System.out.println("Exercici 1");
        System.out.println();
        System.out.println("Llegint benvinguda.dat");
        ByteStreams.readBytes("benvinguda.dat");
        System.out.println("\n");
        System.out.println("Llegint first.txt");
        ByteStreams.readBytes("second.txt");
        System.out.println("\n");
        System.out.println("Llegint third.txt");
        ByteStreams.readBytes("third.txt");
        System.out.println("\n");
        System.out.println("Escrivint benvinguda.dat");
        ByteStreams.writeBytes("test.txt", "Benvinguts al món dels stream bytes".getBytes());
    }
    static void testChars() {
        System.out.println("Exercici 2");
        System.out.println();
        System.out.println("Llegint benvinguda.dat");
        CharStreams.readChars("benvinguda.dat");
        System.out.println("\n");
        System.out.println("Llegint first.txt");
        CharStreams.readChars("second.txt");
        System.out.println("\n");
        System.out.println("Llegint third.txt");
        CharStreams.readChars("third.txt");
        System.out.println("\n");
        System.out.println("Escrivint benvinguda.dat");
        CharStreams.writeChars("test.txt", "Benvinguts al món dels stream bytes".toCharArray());
    }

    static void testBuffered() {
        System.out.println("Exercici 3");
        System.out.println();
        System.out.println("Llegint benvinguda.dat");
        BufferedStreams.readLines("benvinguda.dat");
        System.out.println("\n");
        System.out.println("Llegint first.txt");
        BufferedStreams.readLines("second.txt");
        System.out.println("\n");
        System.out.println("Llegint third.txt");
        BufferedStreams.readLines("third.txt");
        System.out.println("\n");
        System.out.println("Escrivint benvinguda.dat");
        BufferedStreams.writeLines("test.txt", "Benvinguts al món\ndels stream bytes".split("\n"));
    }

    static void testData() {
        System.out.println("Exercici 4");
        System.out.println();

        System.out.println("Escrivint test.dat");
        DataStreams.writeArray("test.dat", new double[]{1, 2, 3, 4, 5});

        System.out.println("Llegint test.dat");
        var a = DataStreams.readArray("test.dat");
        System.out.println(Arrays.toString(Objects.requireNonNull(a)));
    }

    static void testObject() {
        System.out.println("Exercici 5");
        System.out.println();

        System.out.println("Escrivint test.dat");
        ObjectStreams.writeObject("test.dat", new Init("Pep", 20));

        System.out.println("Llegint test.dat");
        var a = ObjectStreams.readObject("test.dat");
        System.out.println(Objects.requireNonNull(a));
    }
}

