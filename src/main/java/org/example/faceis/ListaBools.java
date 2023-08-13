package org.example.faceis;

import java.util.ArrayList;
import java.util.Collections;

public class ListaBools {
    static int verTrues(ArrayList<Boolean> parametroLista){
        int qtd = 0;
        for (Boolean item : parametroLista) {
            if (item == true){
                qtd++;
            }
        }
        return qtd;
    }

    public static void main(String[] args) {
        ArrayList<Boolean> argumentoLista = new ArrayList<>();
        Collections.addAll(argumentoLista, true, false, false, true, true);

        System.out.println("A quantidade de trues é: "+verTrues(argumentoLista));
    }
}


