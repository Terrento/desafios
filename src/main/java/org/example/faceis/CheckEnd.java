package org.example.faceis;

public class CheckEnd {
    public boolean checarEnd(String palavra, String chars){
        if (palavra.endsWith(chars)){
            return true;
        } else{
            return false;
        }
    }
}
