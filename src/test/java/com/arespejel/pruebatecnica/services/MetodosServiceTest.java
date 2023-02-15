package com.arespejel.pruebatecnica.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;


public class MetodosServiceTest {

    private static List<Integer> numeros;

    @BeforeEach
    void setUp() {
        numeros = IntStream.rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.toList());
    }

    @Test
    void extraerNumero() {
        String esperado = "El numero 5 se a quitado del conjunto de numeros. \n" +
                "[1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]\n";
        String esperadof= "El numero 5 se a quitado del conjunto de numeros. \n" +
                "[1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]\n";

        MetodosServiceImpl service = new MetodosServiceImpl();
        String mensajef = service.extract(5);
        assertFalse(mensajef.equals(esperado));

        String mensaje  = service.extract(null);
        assertTrue(mensaje.equals("Debe de ingresar un numero"));

        mensaje = service.extract(1000);
        assertTrue(mensaje.equals("El número debe estar entre 1 y 100."));

        assertFalse(mensajef.equals(esperadof));
    }
}
