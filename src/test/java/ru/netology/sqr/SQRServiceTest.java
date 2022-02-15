package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSquaresReturnsCorrectValue() {
        SQRService service = new SQRService();

        //Arrange
        int border1 = 200;
        int border2 = 300;
        int expected = 3;

        //Act
        int actual = service.calculateSquares(border1, border2);

        //Assert
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateSquaresReturnsZeroIfNoEntries() {
        SQRService service = new SQRService();

        //Arrange
        int border1 = 0;
        int border2 = 15;
        int expected = 0;

        //Act
        int actual = service.calculateSquares(border1, border2);

        //Assert
        assertEquals(expected, actual);
    }
}