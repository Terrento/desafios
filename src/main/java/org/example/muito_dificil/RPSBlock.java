package org.example.muito_dificil;

import java.util.HashMap;
import java.util.Map;

public class RPSBlock {
    public int tercNum(int numero1, int numero2){
        Map<Integer, Integer> tabela = new HashMap<>(){{
            put(0, 2); put(1, 7); put(2, 6); put(3, 9);
            put(4, 5); put(5, 1); put(6, 4); put(7, 3);
            put(8, 8);
        }};

        numero1 = tabela.get(numero1);
        numero2 = tabela.get(numero2);

        int resultado = 15 - numero1 - numero2;

        Map<Integer, Integer> tabelaInversa = new HashMap<>();
        for (Map.Entry<Integer, Integer> entrada : tabela.entrySet()){
            tabelaInversa.put(entrada.getValue(), entrada.getKey());
        }
        resultado = tabelaInversa.get(resultado);

        return resultado;
    }
}
