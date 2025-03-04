package com.universtiy.Student_portal_api.model;

public class Marks {
    private int studentId;
    private int internalMarks;
    private int externalMarks;

    public Marks(int studentId, int internalMarks, int externalMarks) {
        this.studentId = studentId;
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getInternalMarks() {
        return internalMarks;
    }

    public void setInternalMarks(int internalMarks) {
        this.internalMarks = internalMarks;
    }

    public int getExternalMarks() {
        return externalMarks;
    }

    public void setExternalMarks(int externalMarks) {
        this.externalMarks = externalMarks;
    }
}