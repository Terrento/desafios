package org.example.dificeis;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

//    @Test
//    void testeBoom() {
//        SeteBoom seteBoom = new SeteBoom();
//        int[] ar = {90, 68, 1007};
//        assertEquals("Boom!", seteBoom.acharNumero(ar, '7'));
//    }

//    @Test
//    void testeValidaSenha(){
//        ValidaSenha vs = new ValidaSenha();
//        assertEquals(false, vs.validador("1234"));
//    }

//    @Test
//    void testeContarDigitos(){
//        ContarDigitos cd = new ContarDigitos();
//        assertEquals(5, cd.verDigitos(69855));
//    }

//    @Test
//    void testeNumeroCurzon(){
//        CurzonNumber cn = new CurzonNumber();
//        assertTrue(cn.verificaCurzon(5));
//    }
//
//    @Test
//    void testeArrayOrdem(){
//        ArrayOrdem ao = new ArrayOrdem();
//        ArrayList<Integer> lista = new ArrayList<Integer>();
//
//        Collections.addAll(lista, 2, 3, 6, 1, 5, 4, 5);
//        assertFalse(ao.verificaLista(lista));
//    }

    @Test
    void testeMaisEspaco(){
        MaisEspaco me = new MaisEspaco();
        ArrayList<Integer> lista = new ArrayList<Integer>();

        Collections.addAll(lista, 9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5);
        assertEquals(11, me.verficaEspaco(lista));
    }
}