package org.example.muito_dificil;

import java.util.ArrayList;

public class DivParenteses {
    public ArrayList<String> separador(String paren){
        int esq = 0;
        int dir = 0;
        String parte = "";

        ArrayList<String> lista1 = new ArrayList<>();
        for(int i = 0; i < paren.length(); i++) {
            parte += paren.charAt(i);

            if (paren.charAt(i) == '('){
                esq++;
            } else{
                dir++;
            }

            if (esq == dir){
                lista1.add(parte);
                parte = "";
                esq = 0;
                dir = 0;
            }

        }
        System.out.println(lista1);
        return null;
    }
}
