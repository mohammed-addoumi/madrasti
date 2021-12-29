package com.addtech.madrasti.controllers;

import com.addtech.madrasti.domain.Teacher;
import com.addtech.madrasti.repositories.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherRepository teacherRepository;

    @GetMapping
    @ResponseBody
    public List<Teacher> getAllTeachers(){
        return (List<Teacher>) teacherRepository.findAll();
    }
}
