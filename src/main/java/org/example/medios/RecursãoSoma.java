package org.example.medios;

import java.util.Arrays;

public class RecursãoSoma {
    int total = 0;
    int i = 0;
    public int somaLista(int[] lista){
        total += lista[i];
        if(i < lista.length-1){
            i++;
            return somaLista(lista);
        } else{
            return total;
        }
    }
}
