package org.example.expert;

public class ConsecutiveNum {
    public boolean verifyAsc(String number){
        int div = 1;
        String[] numberList = number.split("(?<=\\G.{"+div+"})");

        int i = 0;
        while (i++ < numberList.length-2) {
            if (Integer.parseInt(numberList[i]) >= Integer.parseInt(numberList[i+1])){
                if (numberList[i].length() > numberList[i+1].length()){
                    return false;
                } else{
                    i=-1;
                    div++;
                    numberList = number.split("(?<=\\G.{"+div+"})");
                }
            }
        }
        return true;
    }
}
