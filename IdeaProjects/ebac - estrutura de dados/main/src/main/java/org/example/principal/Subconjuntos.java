package org.example.principal;

import java.util.ArrayList;
import java.util.List;

public class Subconjuntos {
    public static void main(String[] args) {
        int[] S = {1, 2, 3, 41 }; // Exemplo de conjunto S
        int n = 2; // Tamanho dos subconjuntos desejados
        List<List<Integer>> resultado = encontrarSubconjuntos(S, n);

        for (List<Integer> subset : resultado) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> encontrarSubconjuntos(int[] S, int n) {
        List<List<Integer>> resultado = new ArrayList<>();
        List<Integer> subconjuntoAtual = new ArrayList<>();
        backtrack(S, n, 0, subconjuntoAtual, resultado);
        return resultado;
    }

    private static void backtrack(int[] S, int n, int inicio, List<Integer> subconjuntoAtual, List<List<Integer>> resultado) {
        if (subconjuntoAtual.size() == n) {
            resultado.add(new ArrayList<>(subconjuntoAtual));
            return;
        }

        for (int i = inicio; i < S.length; i++) {
            subconjuntoAtual.add(S[i]);
            backtrack(S, n, i + 1, subconjuntoAtual, resultado);
            subconjuntoAtual.remove(subconjuntoAtual.size() - 1); // backtrack
        }
    }
}

