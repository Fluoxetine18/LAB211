/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

import java.util.Random;

/**
 *
 * @author ad
 */
public class LinearSearch {
    private int[] array;
    
    /**
     * This function use to find index of number in array.
     * 
     * @param number number input
     * @return index or -1
     */
    public int findIndex(int number){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==number){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * This function use to print found index.
     * 
     * @param number number input
     */
    public void printFoundIndex(int number){
        if(findIndex(number)!=-1){
            System.out.println("Found " + number + " at index: " + findIndex(number));
        }
        else{
            System.out.println("Not Found!!!");
        }
    }
    
    /**
     * This function use to display array.
     */
    public void displayArray() {
        System.out.print("The array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }
    }
    /**
     * Generate random number integer and assign value to element in array.
     * 
     * @param length number of element in array
     */
    public void randomArray(int length) {
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(length);
        }
    }
}
