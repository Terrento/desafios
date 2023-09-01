package org.example.medios;

public class RPS {
    public void checarVitoria(String p1, String p2){
        String pe = "pedra";
        String pa = "papel";
        String te = "tesoura";
        if (p1.equals(pe) && p2.equals(te) ||
            p1.equals(pa) && p2.equals(pe) ||
            p1.equals(te) && p2.equals(pa)){
            System.out.println("Jogador 1 ganhou.");
        } else if(p1.equals(p2)){
            System.out.println("Empate.");
        } else{
            System.out.println("Jogador 2 ganhou.");
        }
    }
}
