package org.example.medios;

public class Quadratica {
    public String checarRaizes(int a, int b, int c){
        if (a == 0){
            return "Por 'a' ser zero, não há soluções";
        } else {
            double resultado = (b*b)-4*a*c;

            if (resultado>1){
                return "A equação tem dois resultados.";
            } else if (resultado==0) {
                return "A equação tem um resultado.";
            } else {
                return "A equação não possui resultados reais.";
            }
        }
    }
}
