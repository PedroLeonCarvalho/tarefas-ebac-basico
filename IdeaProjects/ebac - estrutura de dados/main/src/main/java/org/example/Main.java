package org.example;

import org.example.principal.Fibonacci;

public class Main {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        var resultado = fibonacci.fibonacci(10);

        System.out.println(resultado);

        System.out.println(fibonacci.fibonacciPegaEnesimoElemento(5));

    }


}