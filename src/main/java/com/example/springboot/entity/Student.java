package com.example.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private int RollNo ;
    private String StdName;
    private String StdFatherName;
    private String StdDeprtName;
    private float Fee;


    // parameterized constructor of Student class

    public Student(int id, int rollNo, String stdName, String stdFatherName, String stdDeprtName, float fee) {
        super();
        Id = id;
        RollNo = rollNo;
        StdName = stdName;
        StdFatherName = stdFatherName;
        StdDeprtName = stdDeprtName;
        Fee = fee;
    }
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    // getter and setter method of above mentioned field

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public long getRollNo() {
        return RollNo;
    }
    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }
    public String getStdName() {
        return StdName;
    }
    public void setStdName(String stdName) {
        StdName = stdName;
    }
    public String getStdFatherName() {
        return StdFatherName;
    }
    public void setStdFatherName(String stdFatherName) {
        StdFatherName = stdFatherName;
    }
    public String getStdDeprtName() {
        return StdDeprtName;
    }
    public void setStdDeprtName(String stdDeprtName) {
        StdDeprtName = stdDeprtName;
    }
    public float getFee() {
        return Fee;
    }
    public void setFee(float fee) {
        Fee = fee;
    }

}
