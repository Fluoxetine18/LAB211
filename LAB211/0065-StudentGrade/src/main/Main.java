/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import bo.StudentBO;
public class Main {
    public static void main(String[] args) {

           StudentBO bo = new StudentBO();
           
           //input data
           bo.createStudent();
           
           //display student information
           bo.displayStudentInformation();
           
           //display classification infomation
           bo.displayClassification();
    }
}
