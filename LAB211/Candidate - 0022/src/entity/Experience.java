/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import constant.IConstant;
import util.Validate;

/**
 *
 * @author ad
 */
public class Experience extends Candidate {

    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type, int expInYear, String proSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    /**
     * Create a experience.
     *
     * @param list the list to store candidate
     */
    @Override
    public void create(List<Candidate> list) {
        super.create(list);
        this.expInYear = Validate.getInt(
                "Enter year of experience",
                "Numeric value out of range",
                "Invalid integer numver",
                1, 100
        );
        this.proSkill = Validate.getString("Enter pro skill: ",
                "Invalid skill.", IConstant.TEXT);
         this.setType(IConstant.EXPERIENCE_TYPE);
    }

}
