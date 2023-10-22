/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import ulti.Validation;


public class EastAsiaCountry extends Country {

    private String terrain;

    public EastAsiaCountry() {
        super();
    }

    public EastAsiaCountry(String code, String name, float area, String terrain) {
        super(code, name, area);
        this.terrain = terrain;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public void display() {
        super.display();
        System.out.printf("%-20s\n", terrain);
    }

     
    public void inputCountry() {
        code = Validation.getString("Enter code: ", "Invalid code!!!", Validation.REGEX_STRING);
        name = Validation.getString("Enter name: ", "Invalid name!!!", Validation.REGEX_STRING);
        area = Validation.getNumberFloat("Enter area: ", "Numeric value out of range", "Invalid float number.", 0, Float.MAX_VALUE);
        terrain = Validation.getString("Enter terrain: ", "Invalid terrain!!!", Validation.REGEX_STRING);
    }

}
