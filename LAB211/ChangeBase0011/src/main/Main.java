/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import util.Helper;
import util.Validate;
import logic.Function;
import util.IConstant;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Function function = new Function();
        int input;
        int output;

        String data = "";
        System.out.println("==== Convert System ====");
        Helper.menuChoice();
        System.out.println("Choose the base number input: ");

        input = Validate.getInt(
                "Out of range, try again!",
                "Input value must digit, try again!",
                1,
                3);

        System.out.println("Choose the base number out: ");

        output = Validate.getInt(
                "Out of range, try again!",
                "Input value must digit, try again!",
                1,
                3);

        switch (input) {
            case 1:
                data = Validate.getString("Enter number binary: ", "Must be enter 0 or 1", IConstant.BINARY_VALID);
                break;
            case 2:
                data = Validate.getString("Enter number decimal: ", "Must be enter 0-9", IConstant.DECIMAL_VALID);
                break;
            case 3:
                data = Validate.getString("Enter number hexadecimal: ", "Must be enter 0-9 A-F", IConstant.HEXADECIMAL_VALID);
                break;
        }
        System.out.println(function.convert(input, output, data));
    }
}
