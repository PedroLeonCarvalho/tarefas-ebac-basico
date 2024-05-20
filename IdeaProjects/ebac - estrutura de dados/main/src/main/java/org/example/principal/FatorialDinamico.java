package org.example.principal;

public class FatorialDinamico {
    // Cache para armazenar os resultados dos fatoriais
    private static long[] cache;

    public FatorialDinamico(int n) {
        // Inicializa o cache com -1 (valor não calculado)
        cache = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            cache[i] = -1;
        }
    }

    public long calculaFatorial(int n) {
        // Se o fatorial já foi calculado, retorna do cache
        if (cache[n] != -1) {
            return cache[n];
        }

        if (n <= 1) {
            return 1L;
        } else {
            // Calcula o fatorial e armazena no cache
            cache[n] = n * calculaFatorial(n - 1);
            return cache[n];
        }
    }

    public static void main(String[] args) {
        int numero =50; // Exemplo de uso
        FatorialDinamico f = new FatorialDinamico(numero);
        long resultado = f.calculaFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}

