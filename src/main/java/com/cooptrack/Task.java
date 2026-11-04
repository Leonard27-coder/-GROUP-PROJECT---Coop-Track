package com.cooptrack;

// Represents a task assigned to a cooperative member.
public class Task {

    // Attributes that store the details of a task.
    private int id;
    private String title;
    private String assignee;
    private String deadline;
    private int workDays;
    private String progress;

    // Default constructor: creates a task with Pending as its initial status.
    public Task() {
        this.progress = "Pending";
    }

    // Parameterized constructor: creates a task with the supplied details.
    public Task(int id, String title, String assignee,
                String deadline, int workDays, String progress) {

        this.id = id;
        this.title = title;
        this.assignee = assignee;
        this.deadline = deadline;
        setWorkDays(workDays);
        this.progress = progress;
    }

    // ==================== GETTERS ====================

    // Returns the task's unique ID.
    public int getId() {
        return id;
    }

    // Returns the task title.
    public String getTitle() {
        return title;
    }

    // Returns the name of the member assigned to the task.
    public String getAssignee() {
        return assignee;
    }

    // Returns the task deadline.
    public String getDeadline() {
        return deadline;
    }

    // Returns the number of days allocated to the task.
    public int getWorkDays() {
        return workDays;
    }

    // Returns the current progress status of the task.
    public String getProgress() {
        return progress;
    }

    // ==================== SETTERS ====================

    // Updates the task's unique ID.
    public void setId(int id) {
        this.id = id;
    }

    // Updates the task title.
    public void setTitle(String title) {
        this.title = title;
    }

    // Updates the member assigned to the task.
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    // Updates the task deadline.
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    // Updates the allocated workdays and prevents negative values.
    public void setWorkDays(int workDays) {
        if (workDays < 0) {
            throw new IllegalArgumentException(
                "Work days cannot be negative."
            );
        }

        this.workDays = workDays;
    }

    // Updates the task's progress status.
    public void setProgress(String progress) {
        this.progress = progress;
    }
}