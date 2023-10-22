/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import binarysearch.BinarySearch;
import java.util.Arrays;
import ulti.Validate;

/**
 *
 * @author ad
 */
public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        //input size of array
        int length = Validate.getNumberInteger("Enter size of array: ",
                "Out of range", "You must input postive decimal number", 0, Integer.MAX_VALUE);
        //input number want to search
        int number = Validate.getNumberInteger("Enter number want to search: ", 
                "Out of range", "You must input postive decimal number", 0, Integer.MAX_VALUE);
        
        //generate random integer in array
        binarySearch.randomArray(length);
        
        //sort array
        binarySearch.sortArray();
        
        //display array
        binarySearch.displayArray();
        
        //linear search
        binarySearch.printFoundIndex(number);
    }
}
