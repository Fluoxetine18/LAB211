/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bo.BubbleSort;
import utils.Validate;

/**
 *
 * @author ad
 */
public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        //input size of array
        int length = Validate.getNumberInteger("Enter size of array: ",
                "Out of range", "You must input postive decimal number", 0, Integer.MAX_VALUE);
        //generate random integer in array
        bubbleSort.randomArray(length);
        //display unsorted array
        bubbleSort.displayArray("Unsorted array: [");
        //bubble sort algorithm
        bubbleSort.sortArray();
        //display sorted array
        bubbleSort.displayArray("Sorted array: [");

    }
}
