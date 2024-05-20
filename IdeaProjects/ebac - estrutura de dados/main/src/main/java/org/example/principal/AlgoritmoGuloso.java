package org.example.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgoritmoGuloso {

    public static List<Integer> calculaTroco (int[] moedas , int valor) {

        Arrays.sort(moedas);
        List<Integer> resultado = new ArrayList<>();

        for (int i = moedas.length - 1; i >= 0; i--) {
            while (valor >= moedas[i]) {
                valor -= moedas[i];
                resultado.add(moedas[i]);
            }
        }
        return resultado;
    }

        public static void main(String[] args) {
            int[] moedas = {1, 5, 10, 25, 50}; // Tipos de moedas disponíveis
            int valor = 93; // Valor de troco a ser dado

            List<Integer> troco = calculaTroco(moedas, valor);
            System.out.println("Troco necessário: " + troco);
        }
    }
