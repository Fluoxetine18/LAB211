/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.EastAsiaCountry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ulti.Constant;
import ulti.Validation;

public class EastAsiaCountryBo {

    private List<EastAsiaCountry> listCountry = new ArrayList<>();

    public List<EastAsiaCountry> getListCountry() {
        return listCountry;
    }

    public boolean checkDuplicate(String code, String name) {
        for (EastAsiaCountry country : listCountry) {
            //if country has code and name equal with parameter => return true ( duplicate)
            if (country.getCode().equalsIgnoreCase(code)
                    && country.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public List<EastAsiaCountry> searchCountry(String name) {
        List<EastAsiaCountry> listSearch = new ArrayList<>();

        //loop from first to last element to check country have name contains name parameter
        for (EastAsiaCountry eastAsiaCountry : listCountry) {
            //if country have name contains parameter => them country vao ben trong listSearch
            if (eastAsiaCountry.getName().toUpperCase().contains(name.toUpperCase())) {
                listSearch.add(eastAsiaCountry);
            }
        }
        return listSearch;
    }

    public void sortCountry() {
        List<EastAsiaCountry> listSort = new ArrayList<>();

        //them tat ca cac phan tu tropng danh sach ban dau vao listSort => sap xep trong list sort
        // de ko bi xao tron du lieu
        listSort.addAll(listCountry);

        /*Loop from the first to last person , 
        after each loop, one person is sorted*/
        for (int i = 0; i < listSort.size(); i++) {
            //Loop from first to last person through unsorted person
            for (int j = 0; j < listSort.size() - 1 - i; j++) {
                //swap two person if not in ascending order
                if (listSort.get(j).getName().compareTo(listSort.get(j + 1).getName()) > 0) {
                    //doi vi tri cua 2 quoc gia
                    Collections.swap(listSort, j, j + 1);
                }
            }
        }
        System.out.printf("%-20s %-20s %-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");

        for (EastAsiaCountry eastAsiaCountry : listSort) {
            eastAsiaCountry.display();
        }
    }

    public void addCountryInformation(EastAsiaCountry country) throws Exception {
        if (checkDuplicate(country.getCode(), country.getName())) {
            throw new Exception("Duplicate country !!!");
        } else {
            listCountry.add(country);
        }

    }
    /**
     * Input information of country
     */
    public void input() {
        EastAsiaCountry country = new EastAsiaCountry();
        country.inputCountry();
        try {
            addCountryInformation(country);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void getRecentlyEnteredInformation() {
        if (listCountry.isEmpty()) {
            System.out.println("LIST IS EMPTY");
        } else {
            System.out.printf("%-20s %-20s %-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
            listCountry.get(listCountry.size() - 1).display();
        }
    }
    
    /**
     * This function use to search a country by name
     */
    public void search() {
        //input name want to search
        String name = Validation.getString("Enter the name you want to search for: ",
                "Wrong", Constant.REGEX_NAME);

        List<EastAsiaCountry> listSearch = searchCountry(name);

        //if listsearch empty => tell error
        if (listSearch.isEmpty()) {
            System.out.println("NOT FOUND COUNTRY");
        } //else hien thi
        else {
            for (EastAsiaCountry eastAsiaCountry : listSearch) {
                System.out.printf("%-20s %-20s %-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
                eastAsiaCountry.display();
            }
        }
    }

}
