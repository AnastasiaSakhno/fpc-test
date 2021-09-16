package com.example.fpc.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Triangle")
public class TriangleTest {
    double sideA = 3;
    double sideB = 5;
    double angle = 60;

    @Test
    void returnsCorrectFigureParameters() {
        Triangle triangle = new Triangle(sideA, sideB, angle);
        double sideC = Math.sqrt(sideA * sideA + sideB * sideB - 2 * sideA * sideB * Math.cos(angle));
        assertEquals(sideA + sideB + sideC, triangle.getPerimeter());
        assertEquals(Math.abs(sideA * sideB * Math.sin(angle) / 2.0), triangle.getArea());
    }
}
