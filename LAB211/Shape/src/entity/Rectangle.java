/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import util.Validate;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Rectangle extends Shape {
    
    private double width, length;

    public Rectangle() {
    }
    
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        perimeter =  (width + length) * 2;
        return perimeter;
    }

    @Override
    public double getArea() {
        area = (width * length);
        return area;
    }
    /**
     * {@inheritDoc }
     */
    @Override
    public void printResult() {
        System.out.println("-----Rectangle-----");
        System.out.printf("Width: %s\n"
                + "Length: %s\n"
                + "Area: %s\n"
                + "Perimeter: %s\n", width, length, getArea(), getPerimeter());
    }
    /**
     * {@inheritDoc }
     */
    @Override
    public void input() {
        while (true) {
             width = Validate.getNumberDouble("Please input side width of Rectangle: ", "Wrong", 0, Double.MAX_VALUE);
             length = Validate.getNumberDouble("Please input length of Rectangle: ", "Wrong", 0, Double.MAX_VALUE);
            if (width > length) {
                System.out.println("Width cannot greater than length");
            }else {
                break;
            }
        }

    }

}
