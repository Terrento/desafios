package org.example.faceis;

public class TrocarNome {
    public String trocar(String nome1){
        String[] separado = nome1.split(" ");

        StringBuffer sb = new StringBuffer();
        for (int i = separado.length - 1; i >= 0; i--){
            sb.append(separado[i]);
            sb.append(" ");
        }
        String nome2 = sb.toString().strip();

        return nome2;
    }
}
