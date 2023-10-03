package org.example.expert;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FiscalCode {
    public void gerarCodigo(String name, String surname, char gender, String dob){
        StringBuilder str = new StringBuilder("");
        System.out.println(str.append(createSurname(surname))
                .append(createName(name))
                .append(createFinal(dob, gender)));
    }

    private boolean verifyConsonant(char letter){
        return letter == 'a' || letter == 'e' || letter == 'i'
                || letter == 'o' || letter == 'u';
    }

    private String createSurname(String surname){
        StringBuilder str = new StringBuilder("");
        surname = surname.toUpperCase();
        String vowels = "";

        if (surname.length()<3){
            for (int i = 0; i < surname.length(); i++) {
                str.append(surname.charAt(i));
            }
            str.append("X");
        } else{
            surname = surname.toLowerCase();
            for (int i = 0; i < surname.length(); i++) {
                if (verifyConsonant(surname.charAt(i))){
                    vowels = new StringBuilder(vowels).append(surname.charAt(i)).toString();
                    surname = new StringBuilder(surname).deleteCharAt(i).toString();
                    i--;
                }
            }
            surname = surname.toUpperCase();
            vowels = vowels.toUpperCase();

            if (surname.length() >= 3){
                str.append(surname.charAt(0));
                str.append(surname.charAt(1));
                str.append(surname.charAt(2));
            } else{
                str.append(surname);
                str.append(vowels.charAt(0));
            }
        }
        return String.valueOf(str);
    }

    private String createName(String name){
        StringBuilder str = new StringBuilder("");
        name = name.toUpperCase();
        String vowels = "";

        if (name.length()<3){
            for (int i = 0; i < name.length(); i++) {
                str.append(name.charAt(i));
            }
            str.append("X");
        } else {
            name = name.toLowerCase();
            for (int i = 0; i < name.length(); i++) {
                if (verifyConsonant(name.charAt(i))) {
                    vowels = new StringBuilder(vowels).append(name.charAt(i)).toString();
                    name = new StringBuilder(name).deleteCharAt(i).toString();
                    i--;
                }
            }
            name = name.toUpperCase();
            vowels = vowels.toUpperCase();
            if (name.length() == 3) {
                str.append(name.charAt(0));
                str.append(name.charAt(1));
                str.append(name.charAt(2));
            } else if (name.length() > 3) {
                str.append(name.charAt(0));
                str.append(name.charAt(2));
                str.append(name.charAt(3));
            } else{
                str.append(name);
                str.append(vowels.charAt(0));
            }
        }
        return str.toString();
    }

    private String createFinal(String dob, char gender){
        StringBuilder str = new StringBuilder("");
        Map<Integer, Character> map = new HashMap<>(){{
            put(1, 'A'); put(2, 'B'); put(3, 'C'); put(4, 'D');
            put(5, 'E'); put(6, 'H'); put(7, 'L'); put(8, 'M');
            put(9, 'P'); put(10, 'R'); put(11, 'S'); put(12, 'T');
        }};

        str.append(dob.charAt(dob.length()-2)).append(dob.charAt(dob.length()-1));

        String pattern = "/(.*?)/";
        Pattern monthPattern = Pattern.compile(pattern);
        Matcher monthMatcher = monthPattern.matcher(dob);
        monthMatcher.find();

        str.append(map.get(Integer.parseInt(monthMatcher.group(1))));

        Pattern dayPattern = Pattern.compile("^(.*?)/");
        Matcher dayMatcher = dayPattern.matcher(dob);
        dayMatcher.find();

        if (gender == 'M'){
            if (Integer.parseInt(dayMatcher.group(1)) < 10){
                str.append("0").append(dayMatcher.group(1));
            } else{
                str.append(dayMatcher.group(1));
            }
        } else{
            int day = 40 + Integer.parseInt(dayMatcher.group(1));
            str.append(String.valueOf(day));
        }

        return str.toString();
    }
}
