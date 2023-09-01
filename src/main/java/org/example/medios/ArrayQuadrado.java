package org.example.medios;

import java.util.Arrays;

public class ArrayQuadrado {

    public void gerarQuadrado(int tamanho){
        int[][] lista = new int[tamanho][tamanho];
        for (int[] linha:lista) {
            Arrays.fill(linha, tamanho);
        }
        System.out.println( Arrays.deepToString(lista).replace("],", "],\n"));
    }
}
