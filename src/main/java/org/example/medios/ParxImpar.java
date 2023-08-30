package org.example.medios;

import java.util.ArrayList;

public class ParxImpar {
    public int gerarNumero(int[] lista){
        int resultado = 0;
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] % 2 == 0){
                pares += lista[i];
            } else{
                impares += lista[i];
            }
            resultado = (pares > impares) ? pares-impares:impares-pares;
        }
        return resultado;
    }
}
