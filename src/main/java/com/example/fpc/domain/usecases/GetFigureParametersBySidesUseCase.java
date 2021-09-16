package com.example.fpc.domain.usecases;

import com.example.fpc.domain.FigureParameters;

public interface GetFigureParametersBySidesUseCase {
    /**
     * Calculates figure parameters by figure sides
     * @param sides
     * @return figure parameters
     */
    FigureParameters getFigureParameters(double ...sides);
}
