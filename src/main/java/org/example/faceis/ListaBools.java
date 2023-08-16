package org.example.faceis;

import java.util.ArrayList;

public class ListaBools {
    public int verTrues(ArrayList<Boolean> parametroLista){
        int qtd = 0;
        for (Boolean item : parametroLista) {
            if (item == true){
                qtd++;
            }
        }
        return qtd;
    }
}


