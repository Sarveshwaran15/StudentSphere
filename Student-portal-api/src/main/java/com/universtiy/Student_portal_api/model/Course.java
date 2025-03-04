package com.universtiy.Student_portal_api.model;

public class Course {
    private int studentId;
    private String courseName;
    private String teacherName;

    public Course(int studentId, String courseName, String teacherName) {
        this.studentId = studentId;
        this.courseName = courseName;
        this.teacherName = teacherName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}