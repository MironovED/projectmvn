package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();

        int actual = service.search(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

}
