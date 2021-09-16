package com.example.fpc.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Figure parameters")
public class FigureParametersTest {

    @Test
    void whenCircleProvided_thenReturnsCorrectFigureParameters() {
        double radius = 3;
        Circle circle = new Circle(radius);
        FigureParameters figureParameters = new FigureParameters(circle);
        assertEquals(circle.getPerimeter(), figureParameters.perimeter);
        assertEquals(circle.getArea(), figureParameters.area);
    }

    @Test
    void whenRectangleProvided_thenReturnsCorrectFigureParameters() {
        double sideA = 3;
        double sideB = 5;
        Rectangle rectangle = new Rectangle(sideA, sideB);
        FigureParameters figureParameters = new FigureParameters(rectangle);
        assertEquals(rectangle.getPerimeter(), figureParameters.perimeter);
        assertEquals(rectangle.getArea(), figureParameters.area);
    }

    @Test
    void whenSquareProvided_thenReturnsCorrectFigureParameters() {
        double sideLength = 3;
        Square square = new Square(sideLength);
        FigureParameters figureParameters = new FigureParameters(square);
        assertEquals(square.getPerimeter(), figureParameters.perimeter);
        assertEquals(square.getArea(), figureParameters.area);
    }

    @Test
    void whenTriangleProvided_thenReturnsCorrectFigureParameters() {
        double sideA = 3;
        double sideB = 5;
        double angle = 90;
        Triangle triangle = new Triangle(sideA, sideB, angle);
        FigureParameters figureParameters = new FigureParameters(triangle);
        assertEquals(triangle.getPerimeter(), figureParameters.perimeter);
        assertEquals(triangle.getArea(), figureParameters.area);
    }
}
