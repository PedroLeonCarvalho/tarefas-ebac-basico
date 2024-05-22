package org.example.principal;

import org.example.principal.Calculadora;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculadoraTest {
    public CalculadoraTest() {
    }
 Calculadora calculadora = new Calculadora();
    private long a= 10;
    private long b= 10;

    @Test
    public void soma_HappyPath () {
       long result = calculadora.soma(a,b);
    assertEquals (20, result);
    }

    @Test
    public void soma_WrongResult () {

        long result = calculadora.soma(a,b);
        assertNotEquals (25   , result);
    }
    @Test
    public void subtrai_HappyPath () {
        long result = calculadora.subtrai(a,b);
        assertEquals (0, result);
    }

    @Test
    public void subtrai_WrongResult () {

        long result = calculadora.subtrai(a,b);
        assertNotEquals (1  , result);
    }
    @Test
    public void multiplica_HappyPath () {
        long result = calculadora.multiplica(a,b);
        assertEquals (100, result);
    }

    @Test
    public void multiplica_WrongResult () {

        long result = calculadora.multiplica(a,b);
        assertNotEquals (25   , result);
    }
    @Test
    public void divide_HappyPath () {
        long result = calculadora.divide(a,b);
        assertEquals (1, result);
    }

    @Test
    public void divide_WrongResult () {

        long result = calculadora.divide(a,b);
        assertNotEquals (3   , result);
    }

    @Test
    public void divide_IlegalArgument () {
    int a = 0;
        assertThrows(IllegalStateException.class, () -> {
            calculadora.divide(a, b);
        });
    }



}
