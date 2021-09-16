package com.example.fpc.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Circle")
public class CircleTest {
    double radius = 3;

    @Test
    void returnsCorrectFigureParameters() {
        Circle circle = new Circle(radius);
        assertEquals(2 * Math.PI * radius, circle.getPerimeter());
        assertEquals(Math.PI * radius * radius, circle.getArea());
    }
}
