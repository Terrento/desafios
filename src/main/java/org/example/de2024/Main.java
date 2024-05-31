package org.example.de2024;

public class Main {
    public static void main(String[] args) {
        JadenCasing jc = new JadenCasing();

        String frase = "How can mirrors be real, if our eyes aren't real.";

        System.out.println(frase);
        System.out.println("Transformado: " + jc.convertCases(frase));
    }
}
