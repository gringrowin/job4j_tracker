package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private String group;
    private Date dateOfEnrol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDateOfEnrol() {
        return dateOfEnrol;
    }

    public void setDateOfEnrol(Date dateOfEnrol) {
        this.dateOfEnrol = dateOfEnrol;
    }
}
