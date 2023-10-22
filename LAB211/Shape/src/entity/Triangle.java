
package entity;

import util.Validate;


public class Triangle extends Shape {
    private double sideA,sideB, sideC;

    public Triangle() {
    }
    
    
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    
    /**
     * {@inheritDoc }
     */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    
    /**
     * {@inheritDoc }
     */
    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p-sideA) * (p - sideB) * (p - sideC));
    }
    
    /**
     * {@inheritDoc }
     */
    @Override
    public void printResult() {
        System.out.println("-----Triangle-----");
        System.out.printf("Side A: %s\n"
                + "Side B: %s\n"
                + "Side C: %s\n"
                + "Area: %s\n"
                + "Perimeter: %s\n",sideA,sideB, sideC, getArea(), getPerimeter());
    }
    
    /**
     * {@inheritDoc }
     */
    @Override
    public void input() {
        while (true) {
             sideA = Validate.getNumberDouble("Please input side A of Triangle:", "Wrong", 0, Double.MAX_VALUE);
             sideB = Validate.getNumberDouble("Please input side B of Triangle:", "Wrong", 0, Double.MAX_VALUE);
             sideC = Validate.getNumberDouble("Please input side C of Triangle:", "Wrong", 0, Double.MAX_VALUE);
            if (sideA + sideB > sideC && sideA + sideC > sideB && sideB +sideC > sideA) {
                break;
            }else {
                System.out.println("It not be triangle");
            }
        }
    }
}
