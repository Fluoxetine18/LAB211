/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import java.util.Random;

/**
 *
 * @author ad
 */
public class BubbleSort {
    private int[] array;
    /**
     * This function use to random number in array
     * @param length number of array
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
    
//    Insertion sort algorithm
//    public void sortArray() {
//    int n = array.length;
//        for (int i = 1; i < n; ++i) {
//            int key = array[i];
//            int j = i - 1;
// 
//            /* Move elements of arr[0..i-1], that are
//               greater than key, to one position ahead
//               of their current position */
//            while (j >= 0 && array[j] > key) {
//                array[j + 1] = array[j];
//                j = j - 1;
//            }
//            array[j + 1] = key;
//        }
//    }
    
    //selection sort
//    public void sortArray() {
//    for (int i = 0; i < array.length - 1; i++)  
//        {  
//            int index = i;  
//            for (int j = i + 1; j < array.length; j++){  
//                if (array[j] < array[index]){  
//                    index = j;//searching for lowest index  
//                }  
//            }  
//            int smallerNumber = array[index];   
//            array[index] = array[i];  
//            array[i] = smallerNumber;  
//        }  
//}
    
    /**
     * This function use to display array
     * @param message unsorted array or sorted array
     */
    public void displayArray(String message) {
        
        System.out.print(message);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }
    }
 
}


