package org.example.muito_dificil;

import java.util.ArrayList;

public class Encryption {
    public ArrayList<Integer> cifrar(String frase){
        ArrayList<Integer> lista1 = new ArrayList<>();
        int pri = 0;

        for (int i = 0; i < frase.length(); i++) {
            int num = frase.charAt(i) - pri;
            lista1.add(num);
            pri = frase.charAt(i);
        }
        System.out.println(lista1);
        return lista1;
    }

    public String decifrar(ArrayList<Integer> lista){
        String frase = "";
        int pri = 0;

        for (int i = 0; i < lista.size(); i++) {
            int sec = pri + lista.get(i);
            frase += (char) sec;
            pri = sec;
        }
        return frase;
    }
}
