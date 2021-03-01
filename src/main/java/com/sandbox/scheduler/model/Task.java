package com.sandbox.scheduler.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable<Task> {

    public int urgency = -1;
    public Category category;
    public LocalDateTime timeStamp = LocalDateTime.now();

    public Task(int urgency, Category category) {
        this.urgency = urgency;
        this.category = category;
    }

    public String toString() {
        return "[TASK] URGENCY: " + urgency + " CATEGORY: " + category + " TIMESTAMP: " + timeStamp;
    }

    @Override
    public int compareTo(Task o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return urgency == task.urgency &&
                category == task.category &&
                Objects.equals(timeStamp, task.timeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urgency, category, timeStamp);
    }

}