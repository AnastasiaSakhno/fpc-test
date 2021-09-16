package com.example.fpc.web;

import com.example.fpc.domain.*;
import com.example.fpc.domain.usecases.GetFigureParametersUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/figure-parameters")
public class FigureParametersController {

    private final GetFigureParametersUseCase getFigureParametersUseCase;

    public FigureParametersController(GetFigureParametersUseCase getFigureParametersUseCase) {
        this.getFigureParametersUseCase = getFigureParametersUseCase;
    }

    @GetMapping("/circle")
    @ResponseBody
    public FigureParameters getCircleParameters(@RequestBody CircleRequestBody requestBody) {
        Circle circle = new Circle(requestBody.radius);
        return getFigureParametersUseCase.getFigureParameters(circle);
    }

    @GetMapping("/rectangle")
    @ResponseBody
    public FigureParameters getRectangleParameters(@RequestBody RectangleRequestBody requestBody) {
        Rectangle rectangle = new Rectangle(requestBody.sideA, requestBody.sideB);
        return getFigureParametersUseCase.getFigureParameters(rectangle);
    }

    @GetMapping("/square")
    @ResponseBody
    public FigureParameters getSquareParameters(@RequestBody SquareRequestBody requestBody) {
        Square square = new Square(requestBody.sideLength);
        return getFigureParametersUseCase.getFigureParameters(square);
    }

    @GetMapping("/triangle")
    @ResponseBody
    public FigureParameters getTriangleParameters(@RequestBody TriangleRequestBody requestBody) {
        Triangle triangle = new Triangle(requestBody.sideA, requestBody.sideB, requestBody.angle);
        return getFigureParametersUseCase.getFigureParameters(triangle);
    }

    static class CircleRequestBody {
        double radius;

        void setRadius(double radius) {
            this.radius = radius;
        }
    }

    static class RectangleRequestBody {
        double sideA;
        double sideB;

        void setSideA(double sideA) {
            this.sideA = sideA;
        }

        void setSideB(double sideB) {
            this.sideB = sideB;
        }
    }

    static class SquareRequestBody {
        double sideLength;

        void setSideLength(double sideLength) {
            this.sideLength = sideLength;
        }
    }

    static class TriangleRequestBody {
        double sideA;
        double sideB;
        double angle;

        void setSideA(double sideA) {
            this.sideA = sideA;
        }

        void setSideB(double sideB) {
            this.sideB = sideB;
        }

        void setAngle(double angle) {
            this.angle = angle;
        }
    }
}
