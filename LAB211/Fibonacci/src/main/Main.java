/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import logic.Logic;

/**
 *
 * @author ad
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        System.out.println("The " + number + " sequence of Fibonacci: ");
        // k hash code là 45 số, nhập bn số thì in ra bấy nhiêu số
        Logic fibonacci = new Logic();
        fibonacci.display(number);
    }
}
