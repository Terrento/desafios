package org.example.dificeis;

import org.junit.jupiter.api.Test;

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

    @Test
    void testeContarDigitos(){
        ContarDigitos cd = new ContarDigitos();
        assertEquals(5, cd.verDigitos(69855));
    }
}