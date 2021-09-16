package com.example.fpc.domain;

public class Rectangle implements Figure {
    public final double sideA;
    public final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
