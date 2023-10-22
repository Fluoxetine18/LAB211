/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import linearsearch.LinearSearch;
import ulti.Validate;

/**
 *
 * @author ad
 */
public class Main {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        //input size of array
        int length = Validate.getNumberInteger("Enter size of array: ",
                "Out of range", "You must input postive decimal number", 0, Integer.MAX_VALUE);
        //input number want to search
        int number = Validate.getNumberInteger("Enter search value: ", 
                "Out of range", "You must input postive decimal number", 0, Integer.MAX_VALUE);
        //generate random integer in array
        linearSearch.randomArray(length);
        
        //display array
       linearSearch.displayArray();
        
        //linear search
        linearSearch.printFoundIndex(number);
    }
}
