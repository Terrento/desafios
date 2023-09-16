package org.example.muito_dificil;

public class Palindromo {
    public boolean verificaPal(String palavra){
        boolean meio = false;

        for (char letra : palavra.toCharArray()) {
            int pos = palavra.indexOf(letra);

            if (pos != -1) {
                palavra = new StringBuilder(palavra).deleteCharAt(pos).toString();

                if (palavra.contains(String.valueOf(letra))) {
                    palavra = palavra.replaceFirst(String.valueOf(letra), "");
                } else if (!meio){
                    meio = true;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}
