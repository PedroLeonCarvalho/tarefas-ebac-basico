package br.com.Streams;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String nomes = reader.readLine();

        String[] listaArray = nomes.split(",");

        List<String> listaM = Arrays.stream(listaArray)
                .toList()
                .stream().filter(nome -> nome.contains("Masculino"))
                .collect(Collectors.toList())
                ;

        List<String> listaF = Arrays.stream(listaArray)
                .toList()
                .stream().filter(nome -> nome.contains("Feminino"))
                .collect(Collectors.toList())
                ;
        System.out.println(listaM);
        System.out.println(listaF);




}

}
