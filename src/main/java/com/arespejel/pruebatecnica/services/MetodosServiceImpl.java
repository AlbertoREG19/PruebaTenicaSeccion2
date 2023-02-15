package com.arespejel.pruebatecnica.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class MetodosServiceImpl implements MedosService{
    private static List<Integer> numeros;

    public MetodosServiceImpl() {
        numeros = IntStream.rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.toList());
    }

    @Override
    public String extract(Integer numero) {
        if (numero == null) {
            return "Debe de ingresar un numero";
        }
        if (numero < 1 || numero > 100) {
            return "El número debe estar entre 1 y 100.";
        }
        if (!numeros.contains(numero)) {
            return "El número " + numero + " no está en el conjunto.";
        }
        numeros.removeIf(n -> n == numero);
        return "El numero "+numero+" se a quitado del conjunto de numeros. \n"+numeros;
    }
}
