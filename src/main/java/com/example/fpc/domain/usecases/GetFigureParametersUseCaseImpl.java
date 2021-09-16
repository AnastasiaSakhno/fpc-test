package com.example.fpc.domain.usecases;

import com.example.fpc.domain.Figure;
import com.example.fpc.domain.FigureParameters;
import org.springframework.stereotype.Service;

@Service
public class GetFigureParametersUseCaseImpl implements GetFigureParametersUseCase {

    @Override
    public FigureParameters getFigureParameters(Figure figure) {
        return new FigureParameters(figure);
    }
}
