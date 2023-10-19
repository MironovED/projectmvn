package ru.netology.javaqa;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")  //берет данные из файла data.csv


//    @CsvSource({
//            "100000, true, 30",
//            "10000000, true, 500"
//    })
    public void shouldDoIt(int amount, boolean isRegistred, int expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, isRegistred);

        assertEquals(expected, actual);

    }



//    @Test
//    public void shouldDoIt() {
//        BonusService service = new BonusService();
//
//        long actual = service.calculate(10_000_000, true);
//        int expected = 500;
//
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void shouldDoIt2() {
//        BonusService service = new BonusService();
//
//        long actual = service.calculate(10_000_000, true);
//        int expected = 500;
//
//        assertEquals(expected, actual);
//
//    }

}
