//This program takes n as slots for a centrifuge, k as available tubes and checks if there's a balance
//Original problem here: https://edabit.com/challenge/qN7mnqKz6Y7WeMnLo
package org.example.expert;

import java.util.ArrayList;
import java.util.List;

public class CentrifugeBalance {
    public boolean isBalanced(int n, int k){
        if (n <= 1 || k <= 1){
            return false;
        }

        List<Integer> listPrimes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                listPrimes.add(i);
            }
        }
        List<Integer> listPossible = new ArrayList<>();
        for (Integer listPrime : listPrimes) {
            if (n % listPrime == 0) {
                int multiples = listPrime;

                while (multiples < n) {
                    if (!listPossible.contains(multiples)) {
                        listPossible.add(multiples);
                        multiples += listPrime;
                    }
                }
            }
        }
        listPossible.add(n);

        return listPossible.contains(k);
    }

    static boolean isPrime(int n){
        if (n < 2)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
