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
public class Circle extends Shape {

    private double radius;

    public Circle() {
    }
    
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;

    }

    /**
     * {@inheritDoc }
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public void printResult() {
        System.out.println("-----Circle-----");
        System.out.printf("Radius: %s\n"
                + "Area: %s\n"
                + "Perimeter: %s\n", radius, getArea(), getPerimeter());
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public void input() {
        radius = Validate.getNumberDouble("Please input radius of Circle:", "Wrong", 0, Double.MAX_VALUE);
    }

}
