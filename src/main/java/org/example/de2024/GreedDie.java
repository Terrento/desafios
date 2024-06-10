/* This code calculates the score of a Greed game based on the
values of the die given.
Original problem can be found here: https://www.codewars.com/kata/5270d0d18625160ada0000e4/javascript
 */

package org.example.de2024;

import java.util.HashMap;
import java.util.Map;

public class GreedDie {

    public int calculateDice(int[] numbers){

        Map<Integer, Integer> tableResults = new HashMap<>();

        for (int number : numbers) {
            switch (number) {
                case 1:
                    tableResults.merge(1, 1, Integer::sum);
                    break;
                case 2:
                    tableResults.merge(2, 1, Integer::sum);
                    break;
                case 3:
                    tableResults.merge(3, 1, Integer::sum);
                    break;
                case 4:
                    tableResults.merge(4, 1, Integer::sum);
                    break;
                case 5:
                    tableResults.merge(5, 1, Integer::sum);
                    break;
                case 6:
                    tableResults.merge(6, 1, Integer::sum);
                    break;
                default:
                    break;
            }
        }

        return getPoints(tableResults);
    }

    private static int getPoints(Map<Integer, Integer> tableResults) {
        int points = 0;

        for (Map.Entry<Integer, Integer> entry : tableResults.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if (value >= 3){
                if (key != 1){
                    points += key*100;
                } else{
                    points += 1000;
                }
                value -= 3;
            }
            if (key == 1)
                points += value*100;
            if (key == 5)
                points += value*50;
        }
        return points;
    }
}
