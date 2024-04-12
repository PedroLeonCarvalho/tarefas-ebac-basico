package br.com.tarefa_generics;

import java.util.ArrayList;

public class Generics {


    private Ford ka;
    private Fiat palio;
    ArrayList<Veiculos> listaVeiculos = new ArrayList<>();

    public ArrayList<Veiculos> getListaVeiculos() {
        listaVeiculos.add(ka);
        listaVeiculos.add(palio);



        return listaVeiculos;

    }
public class Veiculos {

}

    public class Ford extends Veiculos{
    }

    public class Fiat extends Veiculos{
    }

}