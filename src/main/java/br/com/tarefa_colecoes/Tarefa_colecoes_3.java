package br.com.tarefa_colecoes;

import java.util.*;

public class Tarefa_colecoes_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new HashMap<>();

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para imprimir o resultado): ");
            String nome = scanner.nextLine();

            if (nome.equals("sair")) {
                break;
            }

            System.out.print("Digite o sexo: ");
            String genero = scanner.nextLine();

            // Criar uma nova lista apenas se não existir para o gênero
            map.computeIfAbsent(genero, k -> new ArrayList<>()).add(nome);
        }

        System.out.println("Mapa de Nomes e Gênero:");
        System.out.println(map);
    }
}

