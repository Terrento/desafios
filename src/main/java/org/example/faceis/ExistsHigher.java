package org.example.faceis;

import java.util.ArrayList;

public class ExistsHigher {

    public boolean checador(ArrayList<Integer> lista, int numero){
        boolean chec = false;
        for (int i = 0; i < lista.size(); i++){
            if (numero > lista.get(i)){
                chec = false;
            } else{
                chec = true;
            }
        }
        return chec;
    }
}
