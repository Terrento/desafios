package org.example.dificeis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testeBoom() {
        SeteBoom seteBoom = new SeteBoom();
        int[] ar = {90, 68, 1007};
        assertEquals("Boom!", seteBoom.acharNumero(ar, '7'));
    }
}