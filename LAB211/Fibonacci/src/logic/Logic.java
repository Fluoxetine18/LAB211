/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author ad
 */
public class Logic {
    public static int fibonacci(int n){
         if(n==0 || n== 1){
            return n;
        } else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    
    public void display(int number){
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i)+ " ,");
        }
    }
}