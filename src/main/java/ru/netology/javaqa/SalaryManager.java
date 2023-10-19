package ru.netology.javaqa;

public class SalaryManager {

    public long sum(int[] salaries) {
        int sum = 0;
        for (int salary : salaries) {
            sum += salary;
        }
        return sum;
    }

    public int max(int[] salaries) {
        int max = salaries[0];
        for (int salary : salaries) {
            if (salary > max) {
                max = salary;
            }
        }
        return max;
    }

}
