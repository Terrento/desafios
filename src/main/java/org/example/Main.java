package org.example;

import org.example.faceis.CheckEnd;
import org.example.faceis.ListaBools;
import org.example.faceis.QtdPalavras;
import org.example.faceis.SequTrian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Digite uma frase: ");
//        String palavra = scan.nextLine();
//
//        QtdPalavras qtd = new QtdPalavras();
//
//        System.out.println("A quantidade de palavras é: " + qtd.contarPalavras(palavra));
// ----------------------------------------------------------------------------------------
//        ListaBools lista = new ListaBools();
//        ArrayList<Boolean> argumentoLista = new ArrayList<>();
//        Collections.addAll(argumentoLista, true, false, false, true, true);
//
//        System.out.println("A quantidade de trues é: "+lista.verTrues(argumentoLista));
//-------------------------------------------------------------------------------------
//        System.out.println("Digite a palavra referencia:");
//        String palavra = scan.nextLine();
//        System.out.println("Agora a checagem:");
//        String chars = scan.nextLine();
//
//        CheckEnd end = new CheckEnd();
//        System.out.println("O resultado do match é "+end.checarEnd(palavra, chars));
//------------------------------------------------------------------------------------
        System.out.println("Qual triângulo você quer saber os pontos?");
        int qtd = scan.nextInt();

        SequTrian seq = new SequTrian();
        System.out.println("A quantidade total de pontos é: " + seq.qtdPontos(qtd));
    }
}