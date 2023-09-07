package org.example.dificeis;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        SeteBoom seteBoom = new SeteBoom();
//        int[] ar = {90, 68, 1007};
//
//        System.out.println(seteBoom.acharNumero(ar, '7'));
//---------------------------------------------------
//        SepararAlfabetico sa = new SepararAlfabetico();
//        sa.orgString("Hello my friend");
//-------------------------------------------------------------
//        ValidaSenha vs = new ValidaSenha();
//        System.out.println(vs.validador("555896"));
//-------------------------------------------------------------
//        ContarDigitos cd = new ContarDigitos();
//        System.out.println(cd.verDigitos(698876));
//------------------------------------------------------------
//        CurzonNumber cn = new CurzonNumber();
//        cn.verificaCurzon(5);
//---------------------------------------------------------------
//        ArrayOrdem ao = new ArrayOrdem();
//        ArrayList<Integer> lista = new ArrayList<Integer>();
//
//        Collections.addAll(lista, 2, 3, 6, 1, 5, 4);
//        ao.verificaLista(lista);
//--------------------------------------------------------------
//        MaisEspaco me = new MaisEspaco();
//        ArrayList<Integer> lista = new ArrayList<Integer>();
//
//        Collections.addAll(lista, 9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5);
//        System.out.println(me.verficaEspaco(lista));
//------------------------------------------------------------------
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        Collections.addAll(lista1, 2, 5, 2, 6, 9);

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        Collections.addAll(lista2,3, 7, 3, 1, 2);

        CartasCombi cc = new CartasCombi();
        cc.maiorNum(lista1, lista2);
    }
}
