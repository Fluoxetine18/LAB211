/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulti;

import java.util.Scanner;

/**
 *
 * @author DarkNess
 */
public class Utility {

    public static final String REGEX_STRING = "[a-zA-Z0-9 ]+";

    public static int getNumberInteger(String message, String error, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            //kiem tra xem dau vao co bi empty
            if (input.isEmpty()) {
                System.out.println("Input is empty !! Enter again !!");
            } else {
                try {
                    int number = Integer.parseInt(input);
                    if (number >= min && number <= max) {
                        return number;
                    } else {
                        System.out.println("Input must be from [" + min + " - " + max + "]");
                    }

                } catch (Exception e) {
                    System.out.println(error);
                }
            }

        }
    }

    public static float getNumberFloat(String message, String error, float min, float max) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            //kiem tra xem dau vao co bi empty
            if (input.isEmpty()) {
                System.out.println("Input is empty !! Enter again !!");
            } else {
                try {
                    float number = Float.parseFloat(input);
                    if (number >= min && number <= max) {
                        return number;
                    } else {
                        System.out.println("Input must be from [" + min + " - " + max + "]");
                    }

                } catch (Exception e) {
                    System.out.println(error);
                }
            }

        }
    }
    /**
     * this function use to get a number double
     * @param message
     * @param error
     * @param min
     * @param max
     * @return number of exception
     */
    public static double getNumberDouble(String message, String error, double min, double max) throws ArithmeticException, NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            double number = 0;
            //kiem tra xem dau vao co bi empty
            if (input.isEmpty()) {
                System.out.println("Input is empty !! Enter again !!");
            } else {
                try {
                    number = Double.parseDouble(input);
                    if (number > min && number <= max) {
                        return number;
                    } else {
                        throw new ArithmeticException("Salary is greater than zero");
                    }

                } catch (NumberFormatException e) {
                    throw new NumberFormatException("You must input digit.");
                }

            }
        }
    }
    
    /**
     * this function use to get a String
     * @param message
     * @param error
     * @param REGEX
     * @return input String
     */
    public static String getString(String message, String error, String REGEX) {
        Scanner scanner = new Scanner(System.in);
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
