package ulti;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Validation {

    private static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_STRING = "[a-zA-Z 0-9]+";
    public static final String REGEX_NAME = "[a-zA-Z ]+";

    /**
     * Don't let anyone instantiate this class.
     */
    private Validation() {
    }

    /**
     * Returns an input integer from the keyboard.
     *
     * @param messageInfo message info
     * @param messageError message error1 Numeric value out of range.
     * @param messageError2 message error2 Invalid integer number.
     * @param min minimum limit value
     * @param max maximum limit value
     * @return the integer value
     */
    public static int getNumberInteger(String messageInfo, String messageError, String messageError2, int min, int max) {
        do {
            try {
                System.out.print(messageInfo);
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.err.println(messageError);
            } catch (NumberFormatException e) {
                System.err.println(messageError2);
            }
        } while (true);
    }

    /**
     * Returns an input float value from the keyboard.
     *
     * @param messageInfo message info
     * @param messageError1 message error1
     * @param messageError2 message error2
     * @param min minimum limit value
     * @param max maximum limit value
     * @return the float value
     */
    public static float getNumberFloat(String messageInfo, String messageError1, String messageError2, float min, float max) {
        do {
            try {
                System.out.print(messageInfo);
                float number = Float.parseFloat(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.err.println(messageError1);
            } catch (NumberFormatException e) {
                System.err.println(messageError2);
            }
        } while (true);
    }

    /**
     * Returns an input string from the keyboard.
     *
     * @param messageInfo message info
     * @param REGEX the pattern to test string is valid or not
     * @param messageError message error
     * @return the string value
     */
    public static String getString(String messageInfo, String messageError, final String REGEX) {
        do {
            System.out.print(messageInfo);
            String str = scanner.nextLine();
            if (str.matches(REGEX)) {
                return str;
            }
            System.out.println(messageError);
        } while (true);
    }
}
