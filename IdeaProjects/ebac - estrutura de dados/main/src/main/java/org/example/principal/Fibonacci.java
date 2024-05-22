package org.example.principal;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public List<Integer> fibonacci (int n) {
        int a = 0, b = 1;

        List<Integer> lista = new ArrayList<>();
        lista.add(a);
        lista.add(b);

        for (int i = 0; i < (n-2); i++) {

          int nextElement = a + b;
          lista.add(nextElement);
          a = b;
          b = nextElement;

        }

        return lista;
    }

    public Integer fibonacciPegaEnesimoElemento (int n) {
        int a = 0, b = 1;

        List<Integer> lista = new ArrayList<>();
        lista.add(a);
        lista.add(b);

        for (int i = 0; i < (n-2); i++) {

            int nextElement = a + b;
            lista.add(nextElement);
            a = b;
            b = nextElement;

        }

        return lista.get(n-1);
    }



}

