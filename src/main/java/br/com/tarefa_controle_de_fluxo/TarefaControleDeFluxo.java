package br.com.tarefa_controle_de_fluxo;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

//Ler do console 4 notas
//retornar a média
// fazer uma condição de validação se é >=7
//imprime aprovado
// nota >=5
//imprime recuperação
// >5
//imprime reprovado
public class TarefaControleDeFluxo {

    public static void main(String[] args) {

        System.out.println("Digite o valor das notas");

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> listaDeNotas = new ArrayList<>();

        for (int i =0; i <4 ; i++) {
            int valor = s.nextInt();
            listaDeNotas.add(valor);
        }

        OptionalDouble mediaComoOptionalDouble = listaDeNotas.stream().mapToDouble(Integer::doubleValue)
                .average();

        Double media = mediaComoOptionalDouble.getAsDouble();

        if (media >= 7) {
            System.out.println( "Aprovado");
        } else if (media >=5 && media  < 7) {
            System.out.println("Em recuperação");
        } else System.out.println("Reprovado");
    }
}
