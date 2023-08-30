package org.example.medios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Quadratica quadratica = new Quadratica();
//
//        System.out.println("Digite os números a, b e c");
//        int a = scan.nextInt(); int b = scan.nextInt(); int c = scan.nextInt();
//
//        System.out.println(quadratica.checarRaizes(a, b, c));
//-------------------------------------------------------------------------------
//        System.out.println("Digite, em sequencia, o numero e quantos multiplos dele você queira");
//        int numero = scan.nextInt();
//        int qtd = scan.nextInt();
//
//        MultiplosArray multiplosArray = new MultiplosArray();
//        System.out.println(multiplosArray.gerarLista(numero, qtd));
//------------------------------------------------------------------------------
//        System.out.println("Digite a valor do menor lado.");
//        double valor1 = scan.nextDouble();
//
//        TrianguloLados trianguloLados = new TrianguloLados();
//        System.out.println("Os outros dois lados são " + trianguloLados.gerarLista(valor1));
//-----------------------------------------------------------------------------------
        ParxImpar pi = new ParxImpar();
        int[] lista = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};

        System.out.println("A diferença é " + pi.gerarNumero(lista) + ".");
    }
}
