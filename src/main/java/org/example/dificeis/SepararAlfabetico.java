package org.example.dificeis;

import java.util.*;

public class SepararAlfabetico {
    public void orgString(String frase){
        List<String> lista = new ArrayList<String>(List.of(frase.split(" ")));
        Collections.sort(lista);
        Collections.sort(lista, Comparator.comparingInt(String::length));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
