/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import util.Helper;
import constant.IConstant;
import util.Validate;

/**
 *
 * @author ad
 */
public class Candidate {

    private int id;
    private String firstName;
    private String lastName;
    private int birthDate;
    private String address;
    private String phone;
    private String email;
    private int type;

    public Candidate() {
    }

    public Candidate(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName
                + " | " + this.birthDate
                + " | " + this.address
                + " | " + this.phone
                + " | " + this.email
                + " | " + this.type;
    }

    /**
     * Display full name of the candidate.
     */
    public void displayFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }

    /**
     * Tests whether the candidate exists.
     *
     * @param list the list to store candidate
     * @param id the id to test
     * @return <code>true</code> if candidate exists; <code>false</code>
     * otherwise
     */
    private boolean exists(List<Candidate> list, int id) {
        for (Candidate c : list) {
            if (c.getId() == id) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns candidate id.
     *
     * @param list the list to store candidate
     * @return the integer value
     */
    private int getId(List<Candidate> list) {
        do {
            int id = Validate.getInt(
                    "Enter ID",
                    "Numeric value out of range",
                    "Invalid interger number",
                    1,
                    Integer.MAX_VALUE
            );
            if (exists(list, id)) {
                System.out.println("ID is exitst, try again.");
            } else {
                return id;
            }
        } while (true);
    }

    public void create(List<Candidate> list) {
        this.id = getId(list);
        this.firstName = Validate.getString("Enter first name:",
                "Invalid first name.",
                IConstant.NAME);
        this.lastName = Validate.getString("Enter last name: ",
                "Invalid last name",
                IConstant.NAME);
        this.birthDate = Validate.getInt("Enter birth date",
                "Numeric value out of range (" + IConstant.MIN_YEAR,
                "Invalid interger number",
                IConstant.MIN_YEAR,
                Helper.getCurrentYear()
        );
        this.address = Validate.getString("Enter address: ",
                "Invslid address.", IConstant.ADDRESS);
        this.phone = Validate.getString("Enter phone: ",
                "Invalid phone number", IConstant.PHONE);
        this.email = Validate.getString("Enter email: ",
                "Invalid email address", IConstant.EMAIL);

    }

}
