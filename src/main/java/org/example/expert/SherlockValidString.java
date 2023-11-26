//This program take a string and checks if all the letters appear the same amount of times
//If not, it tries to remove one letter and checks again
//Original problem here: https://edabit.com/challenge/Mgrj26S3LwM8CLAdL

package org.example.expert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SherlockValidString {
    public boolean checkString(String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char key = word.charAt(i);
            map.merge(key, 1, Integer::sum);
        }

        ArrayList<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        int min = entryList.get(entryList.size()-1).getValue();
        int max = entryList.get(0).getValue();

        if (min == max) return true;

        entryList.get(0).setValue(max-1);
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        min = entryList.get(entryList.size()-1).getValue();
        max = entryList.get(0).getValue();

        return min == max;
    }
}
