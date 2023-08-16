package org.example;

import org.example.faceis.ListaBools;
import org.example.faceis.QtdPalavras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String palavra = scan.nextLine();

        QtdPalavras qtd = new QtdPalavras();

        System.out.println("A quantidade de palavras é: " + qtd.contarPalavras(palavra));
// ----------------------------------------------------------------------------------------
        ListaBools lista = new ListaBools();
        ArrayList<Boolean> argumentoLista = new ArrayList<>();
        Collections.addAll(argumentoLista, true, false, false, true, true);

        System.out.println("A quantidade de trues é: "+lista.verTrues(argumentoLista));
    }
}