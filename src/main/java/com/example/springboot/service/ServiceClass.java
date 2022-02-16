package com.example.springboot.service;

import com.example.springboot.entity.Student;
import com.example.springboot.repository.StudentRepo;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
     private final StudentRepo obj;

    public ServiceClass(StudentRepo obj) {
        this.obj = obj;
    }

    public Student setdata() {
        Student s1 = new Student();
        s1.setId(1);
        s1.setRollNo(1000);
        s1.setStdName("Subash");
        s1.setStdFatherName("Mr. Tulsi Mandal");
        s1.setStdDeprtName("MCA");
        s1.setFee(45000);
        return obj.save(s1);

    }

}
