package br.com.tarefa_colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//recebe nomes com duplas no console
//separa com split
//salva em listas separadas para -m e -f
//imprime separado
public class Tarefa2Colecoes {

    public static void main(String[] args) {
        System.out.println("Digite nomes seguidos de um traço e M ou F representando o sexo. Exemplo Joao-m, Maria-f");
        Scanner scanner = new Scanner(System.in);
        String nomes = scanner.nextLine();

        List<String> listaDuplas = new ArrayList<>();
        List<String> listaHomens = new ArrayList<>();
        List<String> listaMulheres = new ArrayList<>();


        for (String nome: nomes.split(",")) {
            listaDuplas.add(nome);
        Collections.sort(listaDuplas);
            if (nome.toLowerCase().contains("-m")) {
                listaHomens.add(nome);
            } else if (nome.toLowerCase().contains("-f")) {
                listaMulheres.add(nome);

            }
        }
        System.out.println("Lista de homes" + listaHomens);
        System.out.println("Lista de mulheres" +listaMulheres);

    }
}
