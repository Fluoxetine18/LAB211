/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import entity.Student;
import util.Validate;
public class StudentBO {

    List<Student> listStudent = new ArrayList<>();

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void createStudent() {
        while (true) {
            Student student = new Student();
            //input data
            student.inputStudent();

            //add to list
            listStudent.add(student);

            //check continue
            if (Validate.checkYesNo() == false) {
                break;
            }
        }

    }
    
    public void displayStudentInformation() {
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println("------ Student "+ (i+1) +" Info ------");
            listStudent.get(i).display();
        }
    }
    
    public void displayClassification() {
        HashMap<String,Double> hashMap = new HashMap<>();
        hashMap = getPercentTypeStudent();
        double sizeOfList = getListStudent().size();
        
        System.out.println("--------Classification Info -----");
        //loop form first to last element in hashmap
        for (Map.Entry<String, Double> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            double val = entry.getValue();
            double percent = (val / sizeOfList) * 100;

              System.out.format("%s: %.1f", key, percent);
              System.out.println("%");
        }
    }

    public HashMap<String, Double> getPercentTypeStudent() {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("A", 0.0);
        hashMap.put("B", 0.0);
        hashMap.put("C", 0.0);
        hashMap.put("D", 0.0);

        //loop from first to last element of listStudent
        listStudent.forEach((student) -> {
            double value = hashMap.get(student.getType()) + 1;
            hashMap.replace(student.getType(), value);
        });

        return hashMap;
    }

}
