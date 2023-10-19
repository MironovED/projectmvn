package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaryManagerTest {

    @Test
    public void shouldSum() {
        SalaryManager manager = new SalaryManager();

        int[] salaries = { 10_000, 7_000, 16_000, 11_000};

        long actual = manager.sum(salaries);
        long expected = 44_000;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMax() {
        SalaryManager manager = new SalaryManager();

        int[] salaries = { 10_000, 7_000, 16_000, 11_000};

        long actual = manager.max(salaries);
        long expected = 16_000;

        Assertions.assertEquals(expected, actual);
    }
}
