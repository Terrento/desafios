package org.example.faceis;

public class QtdPalavras {
    public int contarPalavras(String palavras){
        palavras = palavras.strip().replaceAll("\\s{2,}", " ");
        String[] separado = palavras.split(" ");
        return separado.length;
    }
}
