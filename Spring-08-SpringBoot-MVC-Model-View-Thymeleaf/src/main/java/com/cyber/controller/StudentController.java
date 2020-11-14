package com.cyber.controller;

import com.cyber.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Guzal");

        int studentID=new Random().nextInt(1000);
        model.addAttribute("id",studentID);

        List<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        model.addAttribute("numbers",numbers);

        Student student=new Student(1,"Mike","Smith");
        model.addAttribute("student",student);
        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2(){

        return "student/register";
    }
}
