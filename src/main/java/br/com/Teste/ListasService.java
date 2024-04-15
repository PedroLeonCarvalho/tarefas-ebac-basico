package br.com.Teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListasService {

    public List<String> listarFeminino ( )  {
        List<String> nomeGeneroList = new ArrayList<>();
        nomeGeneroList.add ("Ana - Feminino");
        nomeGeneroList.add("Pedro - Masculino");
        nomeGeneroList.add("Maria - Feminino");
        nomeGeneroList.add("João - Masculino");
        nomeGeneroList.add("Camila - Feminino");
        nomeGeneroList.add("Lucas - Masculino");
        nomeGeneroList.add("Juliana - Feminino");
        nomeGeneroList.add("Rafael - Masculino");
        nomeGeneroList.add("Larissa - Feminino");
        nomeGeneroList.add("Gabriel - Masculino");;


        List<String> listaM = nomeGeneroList.stream()
                .toList()
                .stream().filter(nome -> nome.contains("Masculino"))
                .collect(Collectors.toList())
                ;

        List<String> listaF = nomeGeneroList.stream()
                .toList()
                .stream().filter(nome -> nome.contains("Feminino"))
                .collect(Collectors.toList())
                ;
return listaF;
    }

}
