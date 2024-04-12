package br.com.reflections;

import br.com.anotations.Tabela;

class OutraClasse {
    public static void main(String[] args) {

     Class<?> classe = ClasseAnotada.class;

        Tabela tabelaAnnotation = classe.getAnnotation(Tabela.class);

            String nomeTabela = tabelaAnnotation.nome();

            System.out.println("Nome da tabela: " + nomeTabela);

        }
    }