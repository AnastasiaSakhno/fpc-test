package com.example.fpc.domain.usecases;

import com.example.fpc.domain.Figure;
import com.example.fpc.domain.FigureParameters;

public interface GetFigureParametersUseCase {
    /**
     * Calculates figure parameters for a figure instance
     * @param figure
     * @return figure parameters
     */
    FigureParameters getFigureParameters(Figure figure);
}
