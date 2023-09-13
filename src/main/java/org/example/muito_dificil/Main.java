package org.example.muito_dificil;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        Economias economias = new Economias();
//
//        System.out.println(economias.verficarDias(2050, 1200, 10));
//----------------------------------------------------------------------
//        DivParenteses div = new DivParenteses();
//
//        div.separador("((())())(()(()()))");
//-----------------------------------------------------------------------
//        Encryption enc = new Encryption();
//        enc.cifrar("Sunshine");
//
//        ArrayList<Integer> lista = new ArrayList<>();
//        Collections.addAll(lista, 72, 33, -73, 84, -12, -3, 13, -13, -68);
//        System.out.println(enc.decifrar(lista));
//------------------------------------------------------------------------
//        AtbashCypher cif = new AtbashCypher();
//
//        cif.cifra("Christmas is the 25th of December.");
//    }
//------------------------------------------------------------------------
        CompletarPalavra cp = new CompletarPalavra();

        System.out.println("O resultado é " + cp.verificarPalavra("u", "beautiful"));
    }
}
