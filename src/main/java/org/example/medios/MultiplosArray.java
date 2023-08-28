package org.example.medios;

import java.util.ArrayList;

public class MultiplosArray {
        public ArrayList<Integer> gerarLista(int numero, int qtd){
            ArrayList<Integer> multiplos = new ArrayList<>();

            for (int i = 1; i <= qtd; i++) {
                multiplos.add(numero*i);
            }
            return multiplos;
        }
}
