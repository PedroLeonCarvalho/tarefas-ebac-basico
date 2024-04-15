package br.com.Teste;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TesteUnitário {
    @Test
    public void testListar() {
        ListasService listasService = new ListasService();
        List<String> listaM = listasService.listarFeminino();


        assertEquals(0, listaM.size());
        assertEquals(5, listaM.get(0));

    }








        }

    }

