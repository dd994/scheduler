package com.sandbox.scheduler.comparator;

import com.sandbox.scheduler.model.Task;

import java.util.Comparator;

public class TaskTimeComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        if (o1.timeStamp.isBefore(o2.timeStamp)) {
            return 1;
        } else if (o2.timeStamp.isBefore(o1.timeStamp)) {
            return -1;
        } else return 0;
    }
}