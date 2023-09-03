package org.example.dificeis;

import java.util.ArrayList;

public class SeteBoom {
    public String acharNumero(int[] ar, char alvo){
        boolean validacao = false;
        for (int i = 0; i < ar.length; i++) {
            String sAr = Integer.toString(ar[i]);

            for (char j: sAr.toCharArray()) {
                if (j == alvo){
                    validacao = true;
                }
            }
        }
        if (validacao){
            return "Boom!";
        } else {
            return "Não há nenhum sete na lista.";
        }
    }
}
