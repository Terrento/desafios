package org.example.muito_dificil;

public class Persistence {
    private int qtd = 0;
    public int persistAditiva(int numero){
        String[] digitos = String.valueOf(numero).split("");
        int resultado = 0;

        for (String digito : digitos) {
            resultado += Integer.parseInt(digito);
        }

        qtd++;
        if (String.valueOf(numero).length() == 1){
            return 0;
        }else if (String.valueOf(resultado).length() > 1){
            return persistAditiva(resultado);
        } else{
            return qtd;
        }
    }

    public int persistMulti(int numero){
        String[] digitos = String.valueOf(numero).split("");
        int resultado = 1;

        for (String digito : digitos) {
            resultado = resultado * Integer.parseInt(digito);
        }

        qtd++;
        if (String.valueOf(numero).length() == 1){
            return 0;
        }else if (String.valueOf(resultado).length() > 1){
            return persistMulti(resultado);
        } else{
            return qtd;
        }
    }
}
