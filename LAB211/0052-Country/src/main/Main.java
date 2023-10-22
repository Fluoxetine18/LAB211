/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.EastAsiaCountryBo;
import ulti.Validation;

public class Main {

    public static void main(String[] args) {
       // View_Country view = new View_Country();
        EastAsiaCountryBo manage = new EastAsiaCountryBo();
        while (true) {
            displayMenu();
            int option = Validation.getNumberInteger("Option: ", "Numeric value out of range.", "Invalid integer number." , 1, 5);
            switch (option) {
                case 1:
                    manage.input();
                    break;
                case 2:
                    //Display information of countries you’ve just input
                    manage.getRecentlyEnteredInformation();
                    break;
                case 3:
                    manage.search();
                    break;
                case 4:
                    manage.sortCountry();
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }

    }

    private static void displayMenu() {
        System.out.println("                               MENU\n"
                + "==========================================================================\n"
                + "1. Input the information of 11 countries in East Asia\n"
                + "2. Display the information of country you've just input\n"
                + "3. Search the information of country by user-entered name\n"
                + "4. Display the information of countries sorted name in ascending order  \n"
                + "5. Exit \n"
                + "==========================================================================");
    }
}
