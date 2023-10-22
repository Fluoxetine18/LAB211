/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entity.Circle;
import entity.Rectangle;
import entity.Shape;
import entity.Triangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("=====Calculator Shape Program=====");
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        //input information
        rectangle.input();
        circle.input();
        triangle.input();
        
        //display result
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}
