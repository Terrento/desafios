package org.example.medios;

public class AcharLetra {

    public void letraAchar(char[][] lista, char alvo){
        int total = 0;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if(lista[i][j] == alvo){
                    total++;
                }
            }
        }
        System.out.println("Esta letra aparece "+total+" vezes.");
    }
}
