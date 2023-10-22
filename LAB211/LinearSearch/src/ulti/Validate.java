/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulti;

import java.util.Scanner;

/**
 *
 * @author ad
 */
public class Validate {
    private static Scanner scanner = new Scanner(System.in);
    
    /**
     * Don't let anyone instantiate this class
     */
    private Validate(){
        
    }
    /**
     * Returns an input integer from the keyboard.
     * @param messageInfo   message info
     * @param messageError1 out of range
     * @param messageError2 You must input positive decimal number
     * @param min           minimum limit value
     * @param max           maximum limit value
     * @return the integer value
     */
    public static int getNumberInteger(String messageInfo, String messageError1, String messageError2, int min, int max) {
        do {
            try {
                System.out.print(messageInfo);
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.err.println(messageError1);
                }
            } catch (NumberFormatException e) {

                System.out.println(messageError2);
            }
        } while (true);
    }
}
