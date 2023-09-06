package org.example.dificeis;

import java.util.ArrayList;
import java.util.Collections;

public class MaisEspaco {
    public int verficaEspaco(ArrayList<Integer> lista){
        Collections.sort(lista);
        int resultado = 0;

        for (int i = 0; i < lista.size()-1; i++) {
            if (lista.get(i+1) - lista.get(i) > resultado){
                resultado = lista.get(i+1) - lista.get(i);
            }
        }
        return resultado;
    }
}
