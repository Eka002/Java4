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

    @Test

    public void calculateTestMin1() {
        SQRService service = new SQRService();

        int actual = service.calculate(100, 101);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void calculateTestMin2() {
        SQRService service = new SQRService();

        int actual = service.calculate(99, 100);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void calculateTestMax1() {
        SQRService service = new SQRService();

        int actual = service.calculate(100, 9801);
        int expected = 90;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void calculateTestMax2() {
        SQRService service = new SQRService();

        int actual = service.calculate(99, 9802);
        int expected = 90;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void calculateTestBreakdown1() {
        SQRService service = new SQRService();

        int actual = service.calculate(0, 99);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void calculateTestBreakdown2() {
        SQRService service = new SQRService();

        int actual = service.calculate(9802, 9888);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void calculateTestAverage1() {
        SQRService service = new SQRService();

        int actual = service.calculate(1900, 4000);
        int expected = 20;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void calculateTestAverage2() {
        SQRService service = new SQRService();

        int actual = service.calculate(1950, 8000);
        int expected = 45;
        Assertions.assertEquals(expected, actual);
    }
}
