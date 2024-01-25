package br.com.tarefa_padroes_de_projeto_1.Factory;

import br.com.tarefa_padroes_de_projeto_1.FiatSUV;
import br.com.tarefa_padroes_de_projeto_1.FiatSedan;
import br.com.tarefa_padroes_de_projeto_1.SUV;
import br.com.tarefa_padroes_de_projeto_1.Sedan;

public class FiatFActory implements CarroFactory {


    @Override
    public Sedan criaSedan() {
        return new FiatSedan();
    }

    @Override
    public SUV criaeSUV() {
        return new FiatSUV();
    }
}
