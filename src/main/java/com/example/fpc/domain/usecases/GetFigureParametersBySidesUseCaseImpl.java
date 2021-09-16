package com.example.fpc.domain.usecases;

import com.example.fpc.domain.FigureParameters;
import org.springframework.stereotype.Service;

@Service
public class GetFigureParametersBySidesUseCaseImpl implements GetFigureParametersBySidesUseCase {

    @Override
    public FigureParameters getFigureParameters(double... sides) {
        // should be calculated by the figure sides
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
