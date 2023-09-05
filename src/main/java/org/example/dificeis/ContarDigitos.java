package org.example.dificeis;

public class ContarDigitos {
    int resultado = 0;
    public int verDigitos(int numero){

        if (numero != 0){
            resultado++;
            return verDigitos(numero/10);
        } else{
            return resultado;
        }
    }
}
