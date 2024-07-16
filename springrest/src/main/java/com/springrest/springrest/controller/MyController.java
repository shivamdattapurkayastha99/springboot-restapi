package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MyController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return  "this is home page";

    }
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return  this.courseService.getCourses();




    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable Long courseId){
        return this.courseService.getCourse(courseId);




    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return  this.courseService.addCourse(course);

    }

}
