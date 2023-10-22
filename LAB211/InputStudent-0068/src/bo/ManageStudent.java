/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import util.Utility;

/**
 *
 * @author ad
 */
public class ManageStudent {

    private List<Student> listStudent = new ArrayList<>();

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void addStudent() {
        System.out.println("====== Collection Sort Program ======");
        //nhap thong tin cua person cho toi khi nao danh sach du 3 thi thoi
        while (true) {
            Student student = new Student();
            student.inputStudent();
            listStudent.add(student);

            //if checkYN --> Yes -> Continue
            //else == No -> dont want continue -> break
            if (!checkYN()) {
                break;
            }
        }
    }

    public void sortStudent() {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }

    public void displayStudent() {
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println("-------------Student" + (i + 1) + "-------------");
            System.out.println(listStudent.get(i));
        }
    }

    private boolean checkYN() {
        String result = Utility.getString("Do you want to enter more student information?(Y/N): ",
                "Must be Y or N", Utility.REGEX_YN);
        return result.equalsIgnoreCase("y");
    }

}
