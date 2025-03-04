package com.universtiy.Student_portal_api.controller;

import com.universtiy.Student_portal_api.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.universtiy.Student_portal_api.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id) {
        Student student = service.getStudentById(id);
        return student != null
                ? ResponseEntity.ok(student)
                : ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}/attendance")
    public ResponseEntity<Attendance> getAttendance(@PathVariable int id) {
        Attendance attendance = service.getAttendance(id);
        return attendance != null
                ? ResponseEntity.ok(attendance)
                : ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}/marks")
    public ResponseEntity<Marks> getMarks(@PathVariable int id) {
        Marks marks = service.getMarks(id);
        return marks != null
                ? ResponseEntity.ok(marks)
                : ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}/courses")
    public ResponseEntity<List<Course>> getCourses(@PathVariable int id) {
        List<Course> courses = service.getCourses(id);
        return courses != null && !courses.isEmpty()
                ? ResponseEntity.ok(courses)
                : ResponseEntity.notFound().build();
    }

    @GetMapping("/events/{department}")
    public ResponseEntity<List<Event>> getEvents(@PathVariable String department) {
        List<Event> events = service.getEvents(department);
        return events != null && !events.isEmpty()
                ? ResponseEntity.ok(events)
                : ResponseEntity.notFound().build();
    }
}