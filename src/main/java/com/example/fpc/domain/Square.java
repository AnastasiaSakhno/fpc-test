package com.example.fpc.domain;

public class Square implements Figure {
    public final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
