package br.com.tarefa_colecoes;
// tarefa_colecoes
//pesquisar sobre o comando split
//Ler nomes do console
//guardar em uma collections
// imprimir no console ordenados

import com.sun.source.doctree.SystemPropertyTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.*;
public class TarefaColecoes {
    public static void main(String[] args) {
        System.out.println("Digite os nomes separados por virgula sem espaços:");
        Scanner s = new Scanner(System.in);

        String nomes = s.nextLine();

      List<String> listaNomes = new ArrayList<>();

      for (String palavra : nomes.split(","))
          listaNomes.add(palavra);

      Collections.sort(listaNomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : listaNomes) {
            System.out.println(nome);
    } }}



