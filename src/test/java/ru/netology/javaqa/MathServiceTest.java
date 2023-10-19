package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathServiceTest {

    @Test
    public void shouldIt() {
        MathService service = new MathService();
        int actual = service.crazy(400);
        int expected = 31;

        Assertions.assertEquals(expected, actual);

    }
}
