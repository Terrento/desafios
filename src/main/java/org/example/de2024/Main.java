package org.example.de2024;

public class Main {
    public static void main(String[] args) {
        GreedDie gd = new GreedDie();
        int[] results = new int[]{5, 5, 5, 5, 5};

        System.out.println("The result is " + gd.calculateDice(results));
    }
}
