package com.nssol.sample.naming.bad;

public class Sample02 {

    // 便于搜索，表达意图

    public static void bad() {
        int s = 0;
        int[] t = {};
        for (int i = 0; i < 34; i++) {
            s += (t[i] * 4) / 5;
        }
    }

    public static void better() {
        int realDaysPerIdealDay = 4;
        final int WORK_DAYS_PER_WEEK = 5;
        int sum = 0;
        final int NUM_OF_TASKS = 34;
        int[] taskEstimate = {};

        for (int i = 0; i < NUM_OF_TASKS; i++) {
            int realTaskDays = taskEstimate[i] * realDaysPerIdealDay;
            int realTaskWeeks = realTaskDays / WORK_DAYS_PER_WEEK;
            sum += realTaskWeeks;
        }
    }
}
