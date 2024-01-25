package br.com.tarefa_padroes_de_projeto_1.main;

import br.com.tarefa_padroes_de_projeto_1.*;
import br.com.tarefa_padroes_de_projeto_1.Factory.CarroFactory;
import br.com.tarefa_padroes_de_projeto_1.Factory.FiatFActory;
import br.com.tarefa_padroes_de_projeto_1.Factory.ToyotaFactory;

public class Main {
    public static void main(String[] args) {
        CarroFactory toyotaFactory = new ToyotaFactory();
        Sedan toyotaSedan = new ToyotaSedan();
        SUV toyotaSUV = new ToyataSUV();

        toyotaSedan.portaMalasGrande();
        toyotaSUV.suspensaoAlta();
        
        
        CarroFactory carroFactory = new FiatFActory();
        Sedan fiatSedan = new FiatSedan();
        SUV fiatSUV = new FiatSUV();
        
        fiatSUV.suspensaoAlta();
        fiatSedan.portaMalasGrande();
            
    
    }
}
