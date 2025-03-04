package com.universtiy.Student_portal_api.model;

public class Attendance {
    private int studentId;
    private double percentage;

    public Attendance(int studentId, double percentage) {
        this.studentId = studentId;
        this.percentage = percentage;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}