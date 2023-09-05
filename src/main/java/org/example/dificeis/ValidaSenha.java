package org.example.dificeis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaSenha {
    public boolean validador(String senha){
        String regex = "^[0-9]{4}$|^[0-9]{6}$"; //Senha deve ter 4 ou 6 caracteres, apenas números e nenhum espaço
        Pattern p = Pattern.compile(regex);

        if (senha == null){
            return false;
        }

        Matcher m = p.matcher(senha);
        return m.matches();
    }
}
