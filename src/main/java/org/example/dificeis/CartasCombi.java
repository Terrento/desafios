package org.example.dificeis;

import java.util.ArrayList;
import java.util.Collections;

public class CartasCombi {
    public boolean maiorNum(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        Collections.sort(lista1);
        Collections.sort(lista2);

        int num1 = Integer.parseInt(lista1.get(lista1.size()-1) + "" + lista1.get(lista1.size()-2));
        int num2 = Integer.parseInt(lista2.get(lista2.size()-1) + "" + lista2.get(lista2.size()-2));

        boolean resultado = num1 > num2 ? true : false;
        System.out.println(resultado);
        System.out.println(num1 + " " + num2);
        return resultado;
    }
}
