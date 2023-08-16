package org.example.faceis;

public class QtdPalavras {
    public int contarPalavras(String palavras){
        int total = 1;
        for (char c: palavras.toCharArray()) {
            if (Character.isWhitespace(c)){
                total ++;
                }
            }
        return total;
        }
}
