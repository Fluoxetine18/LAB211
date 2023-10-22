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
public class Fresher extends Candidate {

    private int graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type, int graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

     /**
     * Returns graduation rank.
     *
     * @return the string value
     */
    private String getSelectGraduationRank() {
        System.out.println(" 1. Excellence");
        System.out.println(" 2. Good");
        System.out.println(" 3. Fair");
        System.out.println(" 4. Poor");

        int choice = Validate.getInt(
                "Select graduation rank ",
                "NUmeric value out of range",
                "Invalid integer number",
                1, 4
        );
        switch (choice) {
            case 1:
                return "Excellence";
            case 2:
                return "Good";
            case 3:
                return "Fair";
            case 4:
                return "Poor";
        }
        return "none";
    }

    /**
     * Create a fresher.
     *
     * @param list the list to store candidate
     */
    @Override
    public void create(List<Candidate> list) {
        super.create(list);
        this.graduationDate = Validate.getInt(
                "Enter graduation time",
                "Numeric value out of range",
                "Invalid integer number",
                IConstant.MIN_YEAR,
                Helper.getCurrentYear()
        );
        this.graduationRank = getSelectGraduationRank();
        this.education = Validate.getString("Enter education: ",
                "Invalid education.",
                IConstant.TEXT);
        this.setType(IConstant.FRESHER_TYPE);

    }

}
