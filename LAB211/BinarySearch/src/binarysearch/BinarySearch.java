/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ad
 */
public class BinarySearch {

    private int[] array;
    
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
    
    /**
     * This function use bubble sort to sort array in ascending.
     */
    public void sortArray() {
        /*Loop from the first to last array , 
        after each loop, one integer is sorted*/
        for (int i = 0; i < array.length; i++) {
            //Loop from first to last integer through unsorted integer
            for (int j = 0; j < array.length - 1 - i; j++) {
                //swap two integer if not in ascending order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    /**
     * This function use to display array
     */
    public void displayArray() {
        System.out.print("Sorted array: [");
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
     * This function use to print found index.
     * 
     * @param number number input
     */
    public void printFoundIndex(int number) {
        int left = 0;
        int right = array.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] == number) {
                System.out.println("Found " + number + " at index: " + middle);
                return;
            }
            if (number > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        System.out.println("Not Found!!!");
    }
}
