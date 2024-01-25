package br.com.tarefa_padroes_de_projeto_1.Factory;

import br.com.tarefa_padroes_de_projeto_1.SUV;
import br.com.tarefa_padroes_de_projeto_1.Sedan;

public interface CarroFactory {

    Sedan criaSedan();
    SUV criaeSUV();
}