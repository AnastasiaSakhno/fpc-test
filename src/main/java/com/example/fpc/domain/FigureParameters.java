package com.example.fpc.domain;

import java.util.Objects;

public class FigureParameters {
    public final double perimeter;
    public final double area;

    public FigureParameters(Figure figure) {
        this.perimeter = figure.getPerimeter();
        this.area = figure.getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FigureParameters that = (FigureParameters) o;
        return Double.compare(that.perimeter, perimeter) == 0 && Double.compare(that.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(perimeter, area);
    }
}
