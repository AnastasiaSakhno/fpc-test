package com.example.fpc.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Rectangle")
public class RectangleTest {
    double sideA = 3;
    double sideB = 5;

    @Test
    void returnsCorrectFigureParameters() {
        Rectangle rectangle = new Rectangle(sideA, sideB);
        assertEquals(2 * (sideA + sideB), rectangle.getPerimeter());
        assertEquals(sideA * sideB, rectangle.getArea());
    }
}
