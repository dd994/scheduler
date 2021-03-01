package com.sandbox.scheduler.util;

import com.sandbox.scheduler.comparator.TaskCategoryComparator;
import com.sandbox.scheduler.comparator.TaskTimeComparator;
import com.sandbox.scheduler.comparator.TaskUrgencyComparator;
import com.sandbox.scheduler.model.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Scheduler {

    private static final List<Task> list = new ArrayList<>();

    public static void scheduleTask(Task task) {
        Comparator<Task> comparator = new TaskUrgencyComparator().thenComparing(new TaskCategoryComparator()).thenComparing(new TaskTimeComparator());
        list.add(task);
        list.sort(comparator);
    }

    public static void printSchedule() {
        System.out.println(list);
    }

}
