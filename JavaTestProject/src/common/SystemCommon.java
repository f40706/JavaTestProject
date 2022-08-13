package common;

import java.util.Scanner;

public final class SystemCommon {
    public static int scannerInputInt(Scanner scanner) {
        return scannerInputInt(scanner, 10);
    }

    public static short scannerInputShort(Scanner scanner) {
        return scannerInputShort(scanner, 10);
    }

    public static long scannerInputLong(Scanner scanner) {
        return scannerInputLong(scanner, 10);
    }

    public static int scannerInputInt(Scanner scanner, int radix) {
        try {
            return scanner.nextInt(radix);
        } catch (Exception e) {
            return -1;
        }
    }

    public static short scannerInputShort(Scanner scanner, int radix) {
        try {
            return scanner.nextShort(radix);
        } catch (Exception e) {
            return -1;
        }
    }

    public static long scannerInputLong(Scanner scanner, int radix) {
        try {
            return scanner.nextLong(radix);
        } catch (Exception e) {
            return -1;
        }
    }

    public static float scannerInputFloat(Scanner scanner) {
        try {
            return scanner.nextFloat();
        } catch (Exception e) {
            return -1;
        }
    }

    public static double scannerInputDouble(Scanner scanner) {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            return -1;
        }
    }

    public static String scannerInputLine(Scanner scanner) {
        try {
            return scanner.nextLine();
        } catch (Exception e) {
            return "";
        }
    }
}
