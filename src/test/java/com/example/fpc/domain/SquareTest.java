package com.example.fpc.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Rectangle")
public class SquareTest {
    double sideLength = 3;

    @Test
    void returnsCorrectFigureParameters() {
        Square square = new Square(sideLength);
        assertEquals(4 * sideLength, square.getPerimeter());
        assertEquals(sideLength * sideLength, square.getArea());
    }
}
