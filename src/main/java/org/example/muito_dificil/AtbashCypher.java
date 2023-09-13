package org.example.muito_dificil;

import java.util.HashMap;
import java.util.Map;

public class AtbashCypher {
    public String cifra(String frase){
        Map<Character, Character> tabela = new HashMap<Character, Character>(){{
            put('a', 'z'); put('b', 'y'); put('c', 'x'); put('d', 'w'); put('e', 'v');
            put('f', 'u');put('g', 't'); put('h', 's'); put('i', 'r'); put('j', 'q');
            put('k', 'p'); put('l', 'o'); put('m', 'n'); put('n', 'm'); put('o', 'l');
            put('p', 'k'); put('q', 'j'); put('r', 'i'); put('s', 'h'); put('t', 'g');
            put('u', 'f'); put('v', 'e'); put('w', 'd'); put('x', 'c');put('y', 'b');
            put('z', 'a');
        }};

        String resultado = "";
        for (char letra : frase.toCharArray()) {
            if (Character.toString(letra).matches("[a-z]")){
                resultado += tabela.get(letra);
            } else if (Character.toString(letra).matches("[A-Z]")) {
                resultado += Character.toUpperCase(tabela.get(Character.toLowerCase(letra)));
            } else{
                resultado += letra;
            }
        }
        System.out.println(resultado);
        return resultado;
    }
}
