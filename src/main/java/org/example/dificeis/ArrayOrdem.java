package org.example.dificeis;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayOrdem {
    public boolean verificaLista(ArrayList<Integer> lista){
        Collections.sort(lista);

        boolean chec = true;
        for (int i = 0; i < lista.size()-1; i++) {
            if(lista.get(i) == lista.get(i+1)-1){
                "".isEmpty();
            } else{
                chec = false;
            }
        }
        System.out.println(chec);
        return chec;
    }
}
