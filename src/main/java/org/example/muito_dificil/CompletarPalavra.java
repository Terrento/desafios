package org.example.muito_dificil;

public class CompletarPalavra {
    public boolean verificarPalavra(String amostra, String palavra){
        int antes = 0;

        for (char letra : amostra.toCharArray()) {
            int pos = palavra.indexOf(letra, antes);
            if (pos == -1){
                return false;
            }
            antes = pos;
            palavra = new StringBuilder(palavra).deleteCharAt(pos).toString();
        }
        return true;
    }
}
