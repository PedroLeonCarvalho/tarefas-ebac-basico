package org.example.principal;

import org.w3c.dom.ls.LSOutput;

public  class Fatorial {
    public long calculaFatorial(int n) {
        if(n<= 1) {
            return 1L;
        } else {
            long resultado = 1L;
            while (n > 1) {

                resultado *= n;
                n--;
            }
            return resultado;
        }
    }

    public static void main(String[] args) {
        Fatorial f = new Fatorial();
      Long resultado =f.calculaFatorial(25);
        System.out.println(resultado);

    }


}
