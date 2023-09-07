package org.example.muito_dificil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testeEconomias() {
        Economias economias = new Economias();

        assertEquals(53, economias.verficarDias(2050, 1200, 10));
    }
}