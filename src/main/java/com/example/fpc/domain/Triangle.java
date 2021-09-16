package com.example.fpc.domain;

public class Triangle implements Figure {
    public final double sideA;
    public final double sideB;
    public final double angle;

    public Triangle(double sideA, double sideB, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    @Override
    public double getPerimeter() {
        double sideC = Math.sqrt(sideA * sideA + sideB * sideB - 2 * sideA * sideB * Math.cos(angle));
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        return Math.abs(sideA * sideB * Math.sin(angle) / 2.0);
    }
}
