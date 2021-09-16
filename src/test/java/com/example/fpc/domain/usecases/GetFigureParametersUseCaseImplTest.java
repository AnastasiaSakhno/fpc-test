package com.example.fpc.domain.usecases;

import com.example.fpc.domain.Circle;
import com.example.fpc.domain.Figure;
import com.example.fpc.domain.FigureParameters;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Get figure parameters use case")
public class GetFigureParametersUseCaseImplTest {
    private GetFigureParametersUseCase getFigureParametersUseCase = new GetFigureParametersUseCaseImpl();

    @Test
    void whenFigureProvided_thenReturnsFigureParameters() {
        Figure figure = new Circle(3);
        FigureParameters figureParameters = getFigureParametersUseCase.getFigureParameters(figure);
        assertNotNull(figureParameters);
    }

    @Test
    void whenFigureIsNotProvided_thenThrowsNullPointerException() {
        Figure figure = null;
        assertThrows(NullPointerException.class, () -> getFigureParametersUseCase.getFigureParameters(figure));
    }
}
