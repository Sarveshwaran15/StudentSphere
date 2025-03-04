package com.universtiy.Student_portal_api.model;

public class Event {
    private String department;
    private String eventName;
    private double entryFee;
    private String coordinator;
    private String description;

    public Event(String department, String eventName, double entryFee, String coordinator, String description) {
        this.department = department;
        this.eventName = eventName;
        this.entryFee = entryFee;
        this.coordinator = coordinator;
        this.description = description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}