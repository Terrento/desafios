package org.example.dificeis;

public class CurzonNumber {
    public boolean verificaCurzon(int numero){
        double resultado = Math.pow(2, numero)+1/(2*numero)+1;

        if (resultado % 1 == 0){
            System.out.println(true);
            return true;
        } else{
            System.out.println(false);
            return false;
        }
    }
}
