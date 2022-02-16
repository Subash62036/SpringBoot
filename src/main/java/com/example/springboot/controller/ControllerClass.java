package com.example.springboot.controller;

import com.example.springboot.entity.Student;
import com.example.springboot.service.ServiceClass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class ControllerClass {
    private final ServiceClass obj;

    public ControllerClass(ServiceClass obj) {
        this.obj = obj;
    }


    @GetMapping("/save")
    public Student data( ) {
        return obj.setdata();
    }
}
