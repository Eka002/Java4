package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test

    public void calculateTest() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}