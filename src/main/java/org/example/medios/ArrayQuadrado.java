package org.example.medios;

import java.util.Arrays;

public class ArrayQuadrado {

    public String gerarQuadrado(int tamanho){
        int[][] lista = new int[tamanho][tamanho];
        for (int[] linha:lista) {
            Arrays.fill(linha, tamanho);
        }
        return Arrays.deepToString(lista).replace("],", "],\n");
    }
}
