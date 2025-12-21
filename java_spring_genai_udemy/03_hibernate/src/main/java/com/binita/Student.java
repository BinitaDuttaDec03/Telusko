package com.binita;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int rollNo;
    private String name;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}
