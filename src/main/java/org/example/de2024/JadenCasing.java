/* This code receives a phrase and makes all the starting letters
capitalized. The original problem is here:
https://www.codewars.com/kata/5390bac347d09b7da40006f6
*/

package org.example.de2024;

public class JadenCasing {

    public String convertCases(String normal){
        StringBuilder sb = new StringBuilder();
        String regex = " ";
        String[] array = normal.split(regex);

        for (String temp : array) {
            char first = temp.charAt(0);
            char second = (char) (first - 32);

            if (first > 96 && first < 123) {
                sb.append(second);
                sb.append(temp.substring(1));
            } else {
                sb.append(temp);
            }
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length()-1);
        normal = sb.toString().replaceAll("\\s+", " ");
        return normal;
    }
}
