package org.example.expert;

import java.util.ArrayList;
import java.util.List;

public class JosephusPerm {
    public int whoIsFree(int pris, int interval){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < pris; i++) {
            list.add(i);
        }
        int incr = interval-1;

        while (incr < pris){
            list.remove(incr);
            incr+=interval-1;

            if (incr >= list.size()){
                if (list.size() == 1){
                    break;
                } else{
                    incr = incr - list.size();
                }
            }
        }
        return list.get(0);
    }
}
