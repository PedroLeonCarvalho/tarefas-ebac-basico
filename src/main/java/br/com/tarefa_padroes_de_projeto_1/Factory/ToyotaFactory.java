package br.com.tarefa_padroes_de_projeto_1.Factory;

import br.com.tarefa_padroes_de_projeto_1.SUV;
import br.com.tarefa_padroes_de_projeto_1.Sedan;
import br.com.tarefa_padroes_de_projeto_1.ToyataSUV;
import br.com.tarefa_padroes_de_projeto_1.ToyotaSedan;

public class ToyotaFactory implements CarroFactory{
    @Override
    public Sedan criaSedan() {
        return new ToyotaSedan();
    }

    @Override
    public SUV criaeSUV() {
        return new ToyataSUV();
    }
}
