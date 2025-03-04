package com.universtiy.Student_portal_api.service;

import com.universtiy.Student_portal_api.model.Attendance;
import com.universtiy.Student_portal_api.model.Course;
import com.universtiy.Student_portal_api.model.Event;
import com.universtiy.Student_portal_api.model.Marks;
import com.universtiy.Student_portal_api.model.Student;
import com.universtiy.Student_portal_api.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student getStudentById(int studentId) {
        return repository.getStudentById(studentId);
    }

    public Attendance getAttendance(int studentId) {
        return repository.getAttendance(studentId);
    }

    public Marks getMarks(int studentId) {
        return repository.getMarks(studentId);
    }

    public List<Course> getCourses(int studentId) {
        return repository.getCourses(studentId);
    }

    public List<Event> getEvents(String department) {
        return repository.getEvents(department);
    }
}