package org.example.muito_dificil;

public class Economias {
    private int dias;
    public int verficarDias(int preco, int poup, int inv){
        for (int i = 0; i < 7; i++) {
            poup += inv;
            inv++;
            dias++;
            if(poup >= preco){
                break;
            }
        }
        if(poup < preco){
            verficarDias(preco, poup, inv-6);
        }
        return dias;
    }
}
