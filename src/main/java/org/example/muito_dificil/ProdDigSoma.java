package org.example.muito_dificil;

public class ProdDigSoma {
    public int somaDigitos(int... lista){
        int resul = 0;

        for (int numero : lista) {
            resul += numero;
        }
        String[] separador = Integer.toString(resul).split("");
        resul = 1;

        while (separador.length != 1){
            for (String s : separador) {
                resul = resul * Integer.parseInt(s);
            }
            separador = Integer.toString(resul).split("");
            resul = 1;
        }
        return Integer.parseInt(separador[0]);
    }
}
