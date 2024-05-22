package org.example.principal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();
    List<Integer> sequenciaDeFibonacciAte10 = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));

    @Test
    public void imprimeListaFobonacci_HappyPath () {

        var resultadoDoMetodo = fibonacci.fibonacci(10);

        assertEquals(sequenciaDeFibonacciAte10, resultadoDoMetodo);

    }

    @Test
    public void imprimeListaFobonacci_WrongWay () {
        var resultadoDoMetodo = fibonacci.fibonacci(9);
        assertNotEquals(sequenciaDeFibonacciAte10, resultadoDoMetodo);

    }

    @Test
    public void buscaEnesimoElementoFobonacci_HappyPath () {
        Integer quintoElemento= 3;
        var resultadoDoMetodo = fibonacci.fibonacciPegaEnesimoElemento(5);

        assertEquals(quintoElemento, resultadoDoMetodo);

    }

    @Test
    public void buscaEnesimoElementoFobonacci_WrongWay () {
        Integer quintoElementoErrado= 4;
        var resultadoDoMetodo = fibonacci.fibonacciPegaEnesimoElemento(5);
        assertNotEquals(quintoElementoErrado, resultadoDoMetodo);

    }
}
