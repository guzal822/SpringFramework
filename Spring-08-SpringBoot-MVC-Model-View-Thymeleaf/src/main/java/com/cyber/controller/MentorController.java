package com.cyber.controller;

import com.cyber.enums.Gender;
import com.cyber.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String showTable(Model model){

        List<Mentor> mentorList=new ArrayList<>();
        mentorList.add(new Mentor("Mike","Simith",30, Gender.MALE));
        mentorList.add(new Mentor("Alice","Simith",20, Gender.FEMALE));
        mentorList.add(new Mentor("Ola","Sam",50, Gender.MALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";

    }
}
