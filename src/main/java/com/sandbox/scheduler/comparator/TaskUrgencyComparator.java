package com.sandbox.scheduler.comparator;

import com.sandbox.scheduler.model.Task;

import java.util.Comparator;

public class TaskUrgencyComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return Integer.compare(o1.urgency, o2.urgency);
    }
}