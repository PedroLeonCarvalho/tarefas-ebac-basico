package org.example.principal;

public class Calculadora {

    public long soma (long a, long b) {
        return a+b;
    }
    public long subtrai (long a, long b) {
        return a-b;
    }

    public long multiplica (long a, long b) {
        return a*b;
    }

    public long divide (long a, long b) {
        if(a !=0 & b!=0 ) {
        return a%b;
    } else throw new IllegalStateException("Ilegal argument");
}}

