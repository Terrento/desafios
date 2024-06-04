/* This program takes a factorial and counts how many trailing zeros it has.
This is without calculating what is the actual factorial.
Original problem can be found here: https://www.codewars.com/kata/52f787eb172a8b4ae1000a34
*/
package org.example.de2024;

public class TrailingZeros {
    public int findZeros(int number){
        int divFive = number/5;
        int divTwentyFive = number/25;

        int result = 0;
        if (divFive > 0)
            result += divFive;

        if (divTwentyFive > 0)
            result += divTwentyFive;
        return result;
    }
}
