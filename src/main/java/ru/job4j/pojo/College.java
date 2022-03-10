package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Max");
        student.setSurname("Pavlishin");
        student.setGroup("Java");
        student.setDateOfEnrol(new Date());

        System.out.println(student.getName() + " " + student.getSurname()
                + " зачислен в группу " + student.getGroup());
    }
}
