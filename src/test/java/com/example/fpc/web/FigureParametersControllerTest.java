package com.example.fpc.web;

import com.example.fpc.domain.usecases.GetFigureParametersUseCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(FigureParametersController.class)
@DisplayName("figure parameters controller test")
public class FigureParametersControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    GetFigureParametersUseCase getFigureParametersUseCase;

    @Nested
    @DisplayName("circle test")
    class CircleTest {

        @Test
        void whenValidInput_thenReturns200() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/figure-parameters/circle")
                    .contentType("application/json")
                    .content("{\n" +
                            "    \"radius\": 2\n" +
                            "}"))
                    .andExpect(status().isOk());
        }

        @Test
        void whenNotValidInput_thenReturns400() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/figure-parameters/circle")
                    .contentType("application/json")
                    .content("some text"))
                    .andExpect(status().isBadRequest());
        }
    }

    @Nested
    @DisplayName("rectangle test")
    class RectangleTest {

        @Test
        void whenValidInput_thenReturns200() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/figure-parameters/rectangle")
                    .contentType("application/json")
                    .content("{\n" +
                            "    \"sideA\": 2,\n" +
                            "    \"sideB\": 3\n" +
                            "}"))
                    .andExpect(status().isOk());
        }

        @Test
        void whenNotValidInput_thenReturns400() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/figure-parameters/rectangle")
                    .contentType("application/json")
                    .content("some text"))
                    .andExpect(status().isBadRequest());
        }
    }

    @Nested
    @DisplayName("square test")
    class SquareTest {

        @Test
        void whenValidInput_thenReturns200() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/figure-parameters/square")
                    .contentType("application/json")
                    .content("{\n" +
                            "    \"sideLength\": 2\n" +
                            "}"))
                    .andExpect(status().isOk());
        }

        @Test
        void whenNotValidInput_thenReturns400() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/figure-parameters/square")
                    .contentType("application/json")
                    .content("some text"))
                    .andExpect(status().isBadRequest());
        }
    }

    @Nested
    @DisplayName("triangle test")
    class TriangleTest {

        @Test
        void whenValidInput_thenReturns200() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/figure-parameters/triangle")
                    .contentType("application/json")
                    .content("{\n" +
                            "    \"sideA\": 2,\n" +
                            "    \"sideB\": 3,\n" +
                            "    \"angle\": 30\n" +
                            "}"))
                    .andExpect(status().isOk());
        }

        @Test
        void whenNotValidInput_thenReturns400() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/figure-parameters/triangle")
                    .contentType("application/json")
                    .content("some text"))
                    .andExpect(status().isBadRequest());
        }
    }
}
