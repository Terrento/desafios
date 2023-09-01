package org.example.dificeis;

import java.util.ArrayList;

public class SeteBoom {
    public void acharNumero(int[] ar, char alvo){
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
            System.out.println("Boom!");
        } else {
            System.out.println("Não há nenhum sete na lista.");
        }
    }
}
