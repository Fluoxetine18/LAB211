
package entity;


public abstract class Shape {
    protected double perimeter;
    protected double area;
    /**
     * Calculator area Shape and return area
     * 
     * @return double area
     */
    public double getPerimeter(){
        return perimeter;
    }
    
    /**
     * Calculator area Shape and return area
     * 
     * @return double area
     */
    public double getArea(){
        return area;
    }
    
    /**
     * Calculator perimeter of Shape and return perimeter
     * 
     * @return double perimeter
     */
    public void printResult(){
        
    }
  
    
    public void input() {
        
    }
}
