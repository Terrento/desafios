package org.example;

import org.example.faceis.*;

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
//        System.out.println("Qual triângulo você quer saber os pontos?");
//        int qtd = scan.nextInt();
//
//        SequTrian seq = new SequTrian();
//        System.out.println("A quantidade total de pontos é: " + seq.qtdPontos(qtd));
//------------------------------------------------------------------------------------
        System.out.println("Esta é uma calculadora. Digite, em ordem um número, o símbolo de " +
                "operação(+, -, *, /, e depois outro número:");
        double numero1 = scan.nextDouble();
        char simb = scan.next().trim().charAt(0);
        double numero2 = scan.nextDouble();

        Calculadora calculadora = new Calculadora();
        System.out.println("O resultado da operação é: " + calculadora.operacaoCalc(numero1, simb, numero2));
    }
}