package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validate {

    public static Scanner scanner = new Scanner(System.in);
   
    /**
     * Returns an input double from the keyboard.
     * @param messageInfo       message info
     * @param messageError      message error
     * @param min               minimum limit value
     * @param max               maximum limit value
     * @return the double value
     */
      public static double getNumberDouble(String messageInfo, String messageError, double min, double max) {
        do {
            try {
                System.out.print(messageInfo);
                double number = Double.parseDouble(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.err.println("Out of range");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer number.");
            }
        } while (true);
    }

    public static String getString(String message, String error, String REGEX) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Error empty");
            } else if (input.matches(REGEX)) {
                return input;
            } else {
                System.out.println(error);
            }
        }
    }

}
